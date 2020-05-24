package com.xrgx.courseonline.domain;

public class Selection {
    private String sid;//学号
    private String cid;//课程编号

    public Selection() {
    }

    public Selection(String sid, String cid) {
        this.sid = sid;
        this.cid = cid;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }


}
