package com.ssm.service;


import com.ssm.po.Poll;

public interface PollService {
    void insertPoll(Poll poll) throws Exception;

    Poll selectPoll(Integer voteid) throws Exception;

    void createPoll(Integer voteid)throws Exception;

}
