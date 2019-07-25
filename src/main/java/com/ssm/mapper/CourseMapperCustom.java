package com.ssm.mapper;


import com.ssm.po.CommentsCustom;
import com.ssm.po.Course;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface CourseMapperCustom {
    //投票的查詢列表


    List<Course> findAllCourseList() throws Exception;
    Course selectByPrimaryKey(@Param("classid") Integer classid) throws Exception;
    List<Course> queryCourse(Course course) throws Exception;
    List<Course> findByPage(HashMap<String,Object> map);
    int selectCount();
}