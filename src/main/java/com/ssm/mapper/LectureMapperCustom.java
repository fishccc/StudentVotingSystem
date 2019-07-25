package com.ssm.mapper;

import org.apache.ibatis.annotations.Param;


public interface LectureMapperCustom {
    //投票的查詢列表

    public void changePassword(@Param("username") String username, @Param("password") String password) throws Exception;
}