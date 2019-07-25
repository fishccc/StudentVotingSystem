package com.ssm.mapper;

import com.ssm.po.Poll;
import com.ssm.po.PollExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PollMapper {
    int countByExample(PollExample example);

    int deleteByExample(PollExample example);

    int insert(Poll record);

    int insertSelective(Poll record);

    List<Poll> selectByExample(PollExample example);

    int updateByExampleSelective(@Param("record") Poll record, @Param("example") PollExample example);

    int updateByExample(@Param("record") Poll record, @Param("example") PollExample example);
}