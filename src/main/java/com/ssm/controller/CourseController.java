package com.ssm.controller;

import com.ssm.po.Course;
import com.ssm.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @date 2019-04-05-15-35
 */
@Controller
@RequestMapping("course")
public class CourseController {

    @Autowired
    private CourseService courseService;


    @RequestMapping("queryAllCourse")
    public @ResponseBody
    List<Course> queryAllCourse() throws Exception{
        List<Course> courseList = courseService.findAllCourseList();
        return courseList;
    }

    @RequestMapping("queryOneCourse")
    public ModelAndView queryOneCourse(@RequestParam(value = "id")Integer id) throws  Exception{
        Course course = courseService.queryOneCourse(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("course",course);
        modelAndView.setViewName("course/oneCourse");
        return modelAndView;
    }

    @RequestMapping("queryCourse")
    public ModelAndView queryCourse(Course course)throws Exception{
        List<Course> courseList = courseService.queryCourse(course);
        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("courseList", courseList);
//        modelAndView.addObject("courseList",courseList);
        modelAndView.addObject("courseList", courseList);
        modelAndView.setViewName("course/listCourse");
        return modelAndView;
    }

//    @RequestMapping("queryCoursePage")
//    public String queryCoursePage(@RequestParam(value="currentPage",defaultValue="1",required=false)int currentPage, Model model){
//        model.addAttribute("courseList", courseService.findByPage(currentPage));//回显分页数据
//        return "course/listCourse";
//    }
}
