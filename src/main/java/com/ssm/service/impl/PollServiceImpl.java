package com.ssm.service.impl;

import com.ssm.mapper.PollMapperCustom;
import com.ssm.po.Poll;
import com.ssm.service.PollService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @date 2019-04-07-21-30
 */
public class PollServiceImpl implements PollService {

    @Autowired
    private PollMapperCustom pollMapperCustom;

    @Override
    public void insertPoll(Poll poll) throws Exception{
        pollMapperCustom.insertPoll(poll);
    }

    @Override
    public Poll selectPoll(Integer voteid) throws Exception {
        Poll poll = pollMapperCustom.selectPoll(voteid);
        return poll;
    }

    @Override
    public void createPoll(Integer voteid) throws Exception {
        pollMapperCustom.createPoll(voteid);
    }
}
