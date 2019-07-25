package com.ssm.po;

/**
 * 投票包装对象
 * @date 2019-03-30-17-17
 */
public class VoteQueryVo {

    private Vote vote;
    //对原始po进行扩展
    private VoteCustom voteCustom;

    public Vote getVote() {
        return vote;
    }

    public void setVote(Vote vote) {
        this.vote = vote;
    }

    public VoteCustom getVoteCustom() {
        return voteCustom;
    }

    public void setVoteCustom(VoteCustom voteCustom) {
        this.voteCustom = voteCustom;
    }
}
