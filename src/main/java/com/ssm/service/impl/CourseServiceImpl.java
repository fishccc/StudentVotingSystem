package com.ssm.service.impl;

import com.ssm.mapper.CourseMapperCustom;
import com.ssm.po.Course;
import com.ssm.po.PageBean;
import com.ssm.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;

/**
 * @date 2019-04-05-10-11
 */
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseMapperCustom courseMapperCustom;


    @Override
    public List<Course> findAllCourseList() throws Exception {
        return courseMapperCustom.findAllCourseList();
    }

    @Override
    public Course queryOneCourse(Integer classid) throws Exception {
        return courseMapperCustom.selectByPrimaryKey(classid);
    }

    @Override
    public List<Course> queryCourse(Course course) throws Exception {
        return courseMapperCustom.queryCourse(course);
    }

    @Override
    public PageBean<Course> findByPage(int currentPage) {
        HashMap<String,Object> map = new HashMap<String,Object>();
        PageBean<Course> pageBean = new PageBean<Course>();

        //封装当前页数
        pageBean.setCurrPage(currentPage);

        //每页显示的数据
        int pageSize=5;
        pageBean.setPageSize(pageSize);

        //封装总记录数
        int totalCount = courseMapperCustom.selectCount();
        pageBean.setTotalCount(totalCount);

        //封装总页数
        double tc = totalCount;
        Double num =Math.ceil(tc/pageSize);//向上取整
        pageBean.setTotalPage(num.intValue());

        map.put("start",(currentPage-1)*pageSize);
        map.put("size", pageBean.getPageSize());
        //封装每页显示的数据
        List<Course> lists = courseMapperCustom.findByPage(map);
        pageBean.setLists(lists);

        return pageBean;

    }

    @Override
    public int selectCount() {
        return courseMapperCustom.selectCount();
    }
}
