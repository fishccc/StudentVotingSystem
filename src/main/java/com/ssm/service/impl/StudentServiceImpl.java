package com.ssm.service.impl;

import com.ssm.mapper.StudentMapperCustom;
import com.ssm.po.Student;
import com.ssm.po.StudentExample;
import com.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @date 2019-04-03-21-02
 */
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapperCustom studentMapperCustom;

    @Override
    public Student findStudentByUP(String username ,String password) throws Exception {

        return studentMapperCustom.findStudentByUP(username, password);
    }

    @Override
    public void changePassword(String username, String password) throws Exception {
//        studentMapperCustom.
        studentMapperCustom.changePassword(username,password);
    }

    @Override
    public void registerUser(Student student) throws Exception {
        studentMapperCustom.registerUser(student);
    }
}
