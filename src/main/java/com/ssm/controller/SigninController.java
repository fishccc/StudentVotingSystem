package com.ssm.controller;

import com.ssm.po.Lecture;
import com.ssm.po.Student;
import com.ssm.service.LectureService;
import com.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @date 2019-04-04-00-05
 */

@Controller
@RequestMapping("")
public class SigninController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private LectureService lectureService;

    @RequestMapping("user/checkLogin")
    public String checkLogin(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws Exception {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String roles = request.getParameter("roles");
        ModelAndView modelAndView = new ModelAndView();
        if (roles.equals("student")) {
            Student student = studentService.findStudentByUP(username, password);
            if (student != null) {
                session.setAttribute("user", student);
                session.setAttribute("admin" , 0);
                return "redirect:"+ request.getContextPath() +"/index.jsp";
            } else {
                modelAndView.addObject("message","Wrong account or password");
                return "redirect:"+ request.getContextPath() +"/login.jsp";

            }
        }else if(roles.equals("lecturer")){
            Lecture lecture = lectureService.findLectureByUP(username,password);
            if (lecture != null) {
                session.setAttribute("user", lecture);
                session.setAttribute("admin",1);
                return "redirect:"+ request.getContextPath() +"/index.jsp";
            } else {
                modelAndView.addObject("message","Wrong account or password");
                return "redirect:"+ request.getContextPath() +"/login.jsp";

            }
        }else {
            modelAndView.addObject("message","Wrong account or password");
            return "redirect:"+ request.getContextPath() +"/login.jsp";
        }
    }


    @RequestMapping("user/logout")
    public String logout(HttpSession session,HttpServletRequest request) throws Exception {

        session.invalidate();

        return "redirect:"+ request.getContextPath() +"/index.jsp";
    }

    @RequestMapping("user/registerUser")
    public String registerUser(HttpServletRequest request)throws Exception{
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Student student = new Student();
        student.setUsername(username);
        student.setPassword(password);
        studentService.registerUser(student);
        return "redirect:"+ request.getContextPath() +"/login.jsp";

    }

    @RequestMapping("user/changePassword")
    public String changePassword(HttpSession session,HttpServletRequest request) throws Exception{

//        session.getAttribute()

        Integer status = (Integer)request.getSession().getAttribute("admin");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //admin change password
        if(status == 1){
//            Lecture lecture = (Lecture) request.getSession().getAttribute("user");
            lectureService.changePassword(username,password);
        }else{
//            Student student = (Student) request.getSession().getAttribute("user");
            studentService.changePassword(username,password);
        }
        return "redirect:"+ request.getContextPath() +"/login.jsp";
    }
}

