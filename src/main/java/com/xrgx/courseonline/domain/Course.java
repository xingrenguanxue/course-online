package com.xrgx.courseonline.domain;

public class Course {
    private String cid;//课程编号
    private String cname;//课程名
    private String tid;//授课教师
    private int chour;//学时
    private float cmark;//学分
    private String ccollege;//所属学院
    private int cnum;//学生容量
    private String ctimeplace;//上课时间地点

    public Course() {
    }

    public Course(String cid, String cname, String tid, int chour, float cmark, String ccollege, int cnum, String ctimeplace) {
        this.cid = cid;
        this.cname = cname;
        this.tid = tid;
        this.chour = chour;
        this.cmark = cmark;
        this.ccollege = ccollege;
        this.cnum = cnum;
        this.ctimeplace = ctimeplace;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public int getChour() {
        return chour;
    }

    public void setChour(int chour) {
        this.chour = chour;
    }

    public float getCmark() {
        return cmark;
    }

    public void setCmark(float cmark) {
        this.cmark = cmark;
    }

    public String getCcollege() {
        return ccollege;
    }

    public void setCcollege(String ccollege) {
        this.ccollege = ccollege;
    }

    public String getCtimeplace() {
        return ctimeplace;
    }

    public void setCtimeplace(String ctimeplace) {
        this.ctimeplace = ctimeplace;
    }

    public int getCnum() {
        return cnum;
    }

    public void setCnum(int cnum) {
        this.cnum = cnum;
    }


    @Override
    public String toString() {
        return "Course{" +
                "cid='" + cid + '\'' +
                ", cname='" + cname + '\'' +
                ", tid='" + tid + '\'' +
                ", chour=" + chour +
                ", cmark=" + cmark +
                ", ccollege='" + ccollege + '\'' +
                ", cnum=" + cnum +
                ", ctimeplace='" + ctimeplace + '\'' +
                '}';
    }
}
