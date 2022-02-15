package com.test.pojo;

/**
 * @ClassName: Topic
 * @Description: 主题实体类
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2022/2/15 10:01
 */
public class Topic {
    private Integer tid;
    private String tname;

    public Topic() {
    }

    public Topic(Integer tid, String tname) {
        this.tid = tid;
        this.tname = tname;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }
}
