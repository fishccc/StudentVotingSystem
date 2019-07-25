package com.ssm.po;

import sun.plugin.dom.core.Comment;

/**
 * @date 2019-04-06-22-15
 */
public class CommentsCustom extends Comments {
    private Integer classid;
    private Integer voteid;

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public Integer getVoteid() {
        return voteid;
    }

    public void setVoteid(Integer voteid) {
        this.voteid = voteid;
    }
}
