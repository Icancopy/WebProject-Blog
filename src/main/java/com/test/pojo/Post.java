package com.test.pojo;

import java.sql.Timestamp;

/**
 * @ClassName: Post
 * @Description: 帖子详情类
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2022/2/15 10:00
 */
public class Post {
    private Integer pid;
    private String pname;
    private Integer tid;
    private Integer praise;
    private Timestamp pcreate;
    private Timestamp pmodified;
    private Integer uid;

    public Post() {
    }

    public Post(Integer pid, String pname, Integer tid, Integer praise, Timestamp pcreate, Timestamp pmodified, Integer uid) {
        this.pid = pid;
        this.pname = pname;
        this.tid = tid;
        this.praise = praise;
        this.pcreate = pcreate;
        this.pmodified = pmodified;
        this.uid = uid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getPraise() {
        return praise;
    }

    public void setPraise(Integer praise) {
        this.praise = praise;
    }

    public Timestamp getPcreate() {
        return pcreate;
    }

    public void setPcreate(Timestamp pcreate) {
        this.pcreate = pcreate;
    }

    public Timestamp getPmodified() {
        return pmodified;
    }

    public void setPmodified(Timestamp pmodified) {
        this.pmodified = pmodified;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}
