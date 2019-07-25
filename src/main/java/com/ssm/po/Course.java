package com.ssm.po;

public class Course {
    private Integer classid;

    private String name;

    private String description;

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    @Override
    public String toString() {
        return "Course{" +
                "classid=" + classid +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}