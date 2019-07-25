package com.ssm.mapper;

import com.ssm.po.CommentsCustom;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface CommentsMapperCustom {
    List<CommentsCustom> queryCommentByClassid(@Param("classid") Integer classid) throws Exception;
    void insertComment(CommentsCustom commentsCustom)throws Exception;
    List<CommentsCustom> queryCommentByVoteid(@Param("voteid") Integer voteid) throws Exception;

}
