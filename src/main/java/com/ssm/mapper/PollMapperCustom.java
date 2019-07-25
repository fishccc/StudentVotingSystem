package com.ssm.mapper;

import com.ssm.po.Poll;
import org.apache.ibatis.annotations.Param;

public interface PollMapperCustom {
    void insertPoll(Poll poll) throws Exception;
    Poll selectPoll(@Param("voteid") Integer voteid) throws Exception;
    void createPoll(@Param("voteid") Integer voteid) throws Exception;
}
