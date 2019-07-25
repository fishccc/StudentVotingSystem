package com.ssm.service;

import com.ssm.po.Vote;
import com.ssm.po.VoteCustom;
import com.ssm.po.VoteQueryVo;

import java.util.List;

public interface VoteService {

     List<VoteCustom> findVoteList(VoteQueryVo voteQueryVo) throws Exception;

    /**
     * @Description:根据id查找投票信息
     * @param: id 
     */
     VoteCustom findVoteById(Integer id) throws Exception;
    
    /**
     * @Description:更新投票信息
     * @param: id
     * @param: voteCustom
     */
     void updateVote(Integer id ,VoteCustom voteCustom) throws Exception;


     List<Vote> findAllVoteList()throws  Exception;
     void deleteVote(Integer voteid) throws Exception;
     VoteCustom queryOneVote(Integer voteid) throws Exception;
     void insertVote(VoteCustom voteCustom)throws Exception;
}
