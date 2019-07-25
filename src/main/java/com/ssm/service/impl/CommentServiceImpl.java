package com.ssm.service.impl;

import com.ssm.mapper.CommentsMapper;
import com.ssm.mapper.CommentsMapperCustom;
import com.ssm.po.Comments;
import com.ssm.po.CommentsCustom;
import com.ssm.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @date 2019-04-06-21-48
 */
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentsMapper commentsMapper;
    @Autowired
    private CommentsMapperCustom commentsMapperCustom;

    @Override
    public List<Comments> queryAllComment() throws Exception {
        return commentsMapper.selectByExample(null);
    }

    @Override
    public List<CommentsCustom> queryCommentByClassid(Integer classid) throws Exception {
        return commentsMapperCustom.queryCommentByClassid(classid);
    }

    @Override
    public List<CommentsCustom> queryCommentByVoteid(Integer voteid) throws Exception {
        return commentsMapperCustom.queryCommentByVoteid(voteid);
    }

    @Override
    public void insertComment(CommentsCustom commentsCustom) throws Exception {
        commentsMapperCustom.insertComment(commentsCustom);
    }

    @Override
    public void deleteComment(Integer commentid) throws Exception {
        commentsMapper.deleteByPrimaryKey(commentid);
    }
}
