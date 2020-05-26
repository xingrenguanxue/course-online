package com.xrgx.courseonline.domain;

public class Teacher {
    private String tid;//教师编号
    private String tname;//教师姓名
    private String tgender;//性别
    private Integer tage;//年龄
    private String tcollege;//学院

    public Teacher() {
    }

    public Teacher(String tid, String tname, String tgender, Integer tage, String tcollege) {
        this.tid = tid;
        this.tname = tname;
        this.tgender = tgender;
        this.tage = tage;
        this.tcollege = tcollege;
    }

    public Integer getTage() {
        return tage;
    }

    public void setTage(Integer tage) {
        this.tage = tage;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTgender() {
        return tgender;
    }

    public void setTgender(String tgender) {
        this.tgender = tgender;
    }

    public String getTcollege() {
        return tcollege;
    }

    public void setTcollege(String tcollege) {
        this.tcollege = tcollege;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid='" + tid + '\'' +
                ", tname='" + tname + '\'' +
                ", tgender='" + tgender + '\'' +
                ", tage=" + tage +
                ", tcollege='" + tcollege + '\'' +
                '}';
    }
}
