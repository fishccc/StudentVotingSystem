package com.ssm.service.impl;

import com.ssm.exception.CustomException;
import com.ssm.mapper.VoteMapper;
import com.ssm.mapper.VoteMapperCustom;
import com.ssm.po.Vote;
import com.ssm.po.VoteCustom;
import com.ssm.po.VoteQueryVo;
import com.ssm.service.VoteService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @date 2019-03-30-17-49
 */

@Service
public class VoteServiceImpl implements VoteService {

    @Autowired
    private VoteMapperCustom voteMapperCustom;
    @Autowired
    private VoteMapper voteMapper;

    @Override
    public List<VoteCustom> findVoteList(VoteQueryVo voteQueryVo) throws Exception {
        return voteMapperCustom.findVoteList(voteQueryVo);
    }

    @Override
    public VoteCustom findVoteById(Integer id) throws Exception {
        Vote vote = voteMapper.selectByPrimaryKey(id);

        //中间进行业务处理
        //返回voteCustom
        VoteCustom voteCustom = new VoteCustom();
        if (vote == null) {
            throw new CustomException("修改的投票信息不存在！");
        } else {
            BeanUtils.copyProperties(vote, voteCustom);
        }
        return voteCustom;

    }

    @Override
    public void updateVote(Integer id, VoteCustom voteCustom) throws Exception {
        //添加业务校验
        //判断id是否为空，如果为空抛出异常
        voteCustom.setVoteId(id);
        voteMapper.updateByPrimaryKey(voteCustom);
    }

    @Override
    public List<Vote> findAllVoteList() throws Exception {
        return voteMapperCustom.findAllVoteList();
    }

    @Override
    public void deleteVote(Integer voteid) throws Exception {
        voteMapperCustom.deleteVote(voteid);
    }

    @Override
    public VoteCustom queryOneVote(Integer voteid) throws Exception {
        return voteMapperCustom.queryOneVote(voteid);
    }

    @Override
    public void insertVote(VoteCustom voteCustom) throws Exception {
        voteMapperCustom.insertVote(voteCustom);
    }
}
