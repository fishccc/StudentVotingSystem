package com.ssm.po;

public class Poll {
    private Integer voteId;

    private Integer option1Num;

    private Integer option2Num;

    private Integer option3Num;

    private Integer option4Num;

    public Integer getVoteId() {
        return voteId;
    }

    public void setVoteId(Integer voteId) {
        this.voteId = voteId;
    }

    public Integer getOption1Num() {
        return option1Num;
    }

    public void setOption1Num(Integer option1Num) {
        this.option1Num = option1Num;
    }

    public Integer getOption2Num() {
        return option2Num;
    }

    public void setOption2Num(Integer option2Num) {
        this.option2Num = option2Num;
    }

    public Integer getOption3Num() {
        return option3Num;
    }

    public void setOption3Num(Integer option3Num) {
        this.option3Num = option3Num;
    }

    public Integer getOption4Num() {
        return option4Num;
    }

    public void setOption4Num(Integer option4Num) {
        this.option4Num = option4Num;
    }

    @Override
    public String toString() {
        return "Poll{" +
                "voteId=" + voteId +
                ", option1Num=" + option1Num +
                ", option2Num=" + option2Num +
                ", option3Num=" + option3Num +
                ", option4Num=" + option4Num +
                '}';
    }
}