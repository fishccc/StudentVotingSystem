package com.ssm.controller;

import java.io.File;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

/*
 * file upload
 * */
@Controller
public class FileUploadController {


    @RequestMapping("/fileUpload")
    public String handleFormUpload(@RequestParam("uploadfile") List<MultipartFile> uploadfile,HttpServletRequest request) {
        //判断所上传文件是否存在
        ModelAndView modelAndView = new ModelAndView();
        if(!uploadfile.isEmpty() && uploadfile.size() > 0) {
            //循环输出上传的文件
            for(MultipartFile file : uploadfile) {
                //获取上传文件的原始名称
                String originalFilename = file.getOriginalFilename();
                //设置上传文件的保存地址目录
                String dirPath = request.getSession().getServletContext().getRealPath("/upload/");
                File filePath = new File(dirPath);
                //如果保存文件的地址不存在，就先创建目录
                if(!filePath.exists()) {
                    filePath.mkdirs();
                }
                //使用UUID重新命名上传的文件名称（上传人_uuid_原始文件名称）
                String newFilename = "_"+UUID.randomUUID()+"_"+originalFilename;
                try {
                    //使用MultipartFile接口的方法完成文件上传到指定位置
                    file.transferTo(new File(dirPath + newFilename));
                }catch(Exception e) {
                    e.printStackTrace();
                    return "error";
                }
            }
            //跳转的成功页面

            modelAndView.addObject("message","File uploaded successfully");

        }else {
            modelAndView.addObject("message","File upload failed");


        }
        return "result";
    }

    @RequestMapping("/download")
    public ResponseEntity<byte[]> fileDownload(HttpServletRequest request, String filename) throws Exception {
//指定要下载的文件所在路径
        String path = request.getSession().getServletContext().getRealPath("/upload/");
//创建该文件对象
        File file = new File(path+File.separator+filename);
//设置响应头
        HttpHeaders headers = new HttpHeaders();
//通知浏览器以下载的方式打开文件
        headers.setContentDispositionFormData("attachment",filename);
//定义以流的形式下载返回文件数据
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
//使用Spring MVC框架的ResponseEntity对象封装返回下载数据
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers, HttpStatus.OK);
    }

}