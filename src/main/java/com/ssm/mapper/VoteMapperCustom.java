package com.ssm.mapper;

import com.ssm.po.Vote;
import com.ssm.po.VoteCustom;
import com.ssm.po.VoteExample;
import com.ssm.po.VoteQueryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VoteMapperCustom {
    //投票的查詢列表

    public List<VoteCustom> findVoteList(VoteQueryVo voteQueryVo) throws Exception;

    public  List<Vote> findAllVoteList() throws Exception;

    void deleteVote(@Param("voteid") Integer voteid) throws Exception;

    VoteCustom queryOneVote(@Param("voteid") Integer voteid) throws Exception;
    void insertVote(VoteCustom voteCustom) throws Exception;
}