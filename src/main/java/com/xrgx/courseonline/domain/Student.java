package com.xrgx.courseonline.domain;

public class Student {
    private String sid;//学号
    private String sname;//姓名
    private String spwd;//密码
    private String sgender;//性别
    private Integer sage;//年龄
    private Integer sgrade;//年级
    private String sclass;//班级
    private String smajor;//专业
    private String splace;//籍贯
    private String sbirth;//出生日期
    private String snation;//民族

    public Student() {
    }

    public Student(String sid, String sname, String spwd, String sgender, Integer sage, Integer sgrade, String sclass, String smajor, String splace, String sbirth, String snation) {
        this.sid = sid;
        this.sname = sname;
        this.spwd = spwd;
        this.sgender = sgender;
        this.sage = sage;
        this.sgrade = sgrade;
        this.sclass = sclass;
        this.smajor = smajor;
        this.splace = splace;
        this.sbirth = sbirth;
        this.snation = snation;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSpwd() {
        return spwd;
    }

    public void setSpwd(String spwd) {
        this.spwd = spwd;
    }

    public String getSgender() {
        return sgender;
    }

    public void setSgender(String sgender) {
        this.sgender = sgender;
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }

    public Integer getSgrade() {
        return sgrade;
    }

    public void setSgrade(Integer sgrade) {
        this.sgrade = sgrade;
    }

    public String getSclass() {
        return sclass;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass;
    }

    public String getSmajor() {
        return smajor;
    }

    public void setSmajor(String smajor) {
        this.smajor = smajor;
    }

    public String getSplace() {
        return splace;
    }

    public void setSplace(String splace) {
        this.splace = splace;
    }

    public String getSbirth() {
        return sbirth;
    }

    public void setSbirth(String sbirth) {
        this.sbirth = sbirth;
    }

    public String getSnation() {
        return snation;
    }

    public void setSnation(String snation) {
        this.snation = snation;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid='" + sid + '\'' +
                ", sname='" + sname + '\'' +
                ", spwd='" + spwd + '\'' +
                ", sgender='" + sgender + '\'' +
                ", sage=" + sage +
                ", sgrade=" + sgrade +
                ", sclass='" + sclass + '\'' +
                ", smajor='" + smajor + '\'' +
                ", splace='" + splace + '\'' +
                ", sbirth='" + sbirth + '\'' +
                ", snation='" + snation + '\'' +
                '}';
    }
}
