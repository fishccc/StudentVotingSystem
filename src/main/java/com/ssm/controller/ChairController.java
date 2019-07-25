package com.ssm.controller;

import com.ssm.po.Chair;
import com.ssm.po.ChairCustom;
import com.ssm.service.ChairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @date 2019-04-05-17-55
 */

@Controller
@RequestMapping("chair")
public class ChairController {

    @Autowired
    private ChairService chairService;

    @RequestMapping("queryAllChair")
    public @ResponseBody
    List<Chair> queryAllChair() throws Exception {
        List<Chair> chairList = chairService.queryAllChair();
        return chairList;
    }

//    @RequestMapping("queryOneChair")
//    public @ResponseBody
//    Chair queryOneChair(HttpServletRequest request) throws Exception {
//        Integer classid=Integer.parseInt(request.getParameter("id"));
//        ChairCustom chairCustom = chairService.queryOneChair(classid);
//        return chairCustom;
//    }


    @RequestMapping("queryOneChair")
    public ModelAndView queryOneChair(@RequestParam(value = "id") Integer classid) throws Exception{
        ModelAndView modelAndView= new ModelAndView();
        ChairCustom chairCustom = chairService.queryOneChair(classid);
        modelAndView.addObject("chairCustom",chairCustom);
        modelAndView.setViewName("/chair/oneChair");
        return modelAndView;
    }

    @RequestMapping("jsonQueryOneChair")
    public @ResponseBody
    Chair jsonQueryOneChair(@RequestParam( value = "id") Integer classid)throws Exception{
        Chair chair = chairService.queryOneChair(classid);
        return chair;
    }

}
