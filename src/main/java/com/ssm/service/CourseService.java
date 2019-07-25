package com.ssm.service;

import com.ssm.po.Course;
import com.ssm.po.PageBean;

import java.util.List;

public interface CourseService {

     List<Course> findAllCourseList() throws Exception;
     Course queryOneCourse(Integer classid) throws Exception;
     List<Course> queryCourse(Course course) throws Exception;
     PageBean<Course> findByPage(int currentPage);
    int selectCount();
}
