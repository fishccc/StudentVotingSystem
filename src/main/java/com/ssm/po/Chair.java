package com.ssm.po;

public class Chair {
    private Integer chairid;

    private String topic;

    private String note;

    private String description;

    public Integer getChairid() {
        return chairid;
    }

    public void setChairid(Integer chairid) {
        this.chairid = chairid;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic == null ? null : topic.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}