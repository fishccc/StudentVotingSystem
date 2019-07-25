package com.ssm.service;

import com.ssm.po.Lecture;

public interface LectureService {

    /**
     * @Description:According to the account number and password to find lecturer
     * @param: Student
     */
     Lecture findLectureByUP(String username, String password) throws Exception;

     void changePassword(String username,String password) throws Exception;
}
