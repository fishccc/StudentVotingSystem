package com.ssm.service;

import com.ssm.po.Comments;
import com.ssm.po.CommentsCustom;

import java.util.List;

public interface CommentService {
    List<Comments> queryAllComment()throws Exception;
    List<CommentsCustom> queryCommentByClassid(Integer classid) throws Exception;
    List<CommentsCustom> queryCommentByVoteid(Integer voteid) throws Exception;

    void insertComment(CommentsCustom commentsCustom)throws Exception;

    void deleteComment(Integer Commonid)throws Exception;

}
