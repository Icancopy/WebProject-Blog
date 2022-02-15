package com.test.pojo;

import java.sql.Timestamp;

/**
 * @ClassName: PostReply
 * @Description: 帖子回复实体类
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2022/2/15 10:01
 */
public class PostReply {
    private Integer rid;
    private String rcontent;
    private Timestamp rtime;
    private Integer uid;

    public PostReply(Integer rid, String rcontent, Timestamp rtime, Integer uid) {
        this.rid = rid;
        this.rcontent = rcontent;
        this.rtime = rtime;
        this.uid = uid;
    }

    public PostReply() {
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRcontent() {
        return rcontent;
    }

    public void setRcontent(String rcontent) {
        this.rcontent = rcontent;
    }

    public Timestamp getRtime() {
        return rtime;
    }

    public void setRtime(Timestamp rtime) {
        this.rtime = rtime;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}
