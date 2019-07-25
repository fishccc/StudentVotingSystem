package com.ssm.service.impl;

import com.ssm.mapper.LectureMapper;
import com.ssm.mapper.LectureMapperCustom;
import com.ssm.po.Lecture;
import com.ssm.service.LectureService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @date 2019-04-03-21-02
 */
public class LectureServiceImpl implements LectureService {

    @Autowired
    LectureMapper lectureMapper;
    @Autowired
    LectureMapperCustom lectureMapperCustom;

    @Override
    public Lecture findLectureByUP(String username, String password) throws Exception {
        return lectureMapper.findLectureByUP(username,password);
    }

    @Override
    public void changePassword(String username, String password) throws Exception {
        lectureMapperCustom.changePassword(username, password);
    }
}
