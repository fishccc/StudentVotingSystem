package com.ssm.mapper;

import com.ssm.po.Student;
import org.apache.ibatis.annotations.Param;


public interface StudentMapperCustom {
    //投票的查詢列表

     Student findStudentByUP(@Param("username") String username ,@Param("password") String password) throws Exception;
     void changePassword(@Param("username") String username ,@Param("password")  String password);
     void registerUser(Student student)throws Exception;
}