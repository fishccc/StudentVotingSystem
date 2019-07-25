package com.ssm.service;

import com.ssm.po.Student;
import com.ssm.po.StudentCustom;
import com.ssm.po.VoteCustom;
import com.ssm.po.VoteQueryVo;


import java.util.List;

public interface StudentService {


     Student findStudentByUP(String username ,String password) throws Exception;
     void changePassword(String username ,String password) throws Exception;
     void registerUser(Student student) throws Exception;
}
