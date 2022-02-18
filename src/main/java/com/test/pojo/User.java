package com.test.pojo;

/**
 * @ClassName: User
 * @Description: 用户实体类
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2022/2/15 10:00
 */
public class User {
    private Integer uid;
    private String  uname;
    private String  upassword;
    private String  uimg;
    private Integer gender;
    private String  uinfo;
    private String email;

    public User() {
    }

    public User(String uname, String upassword, String email) {
        this.uname = uname;
        this.upassword = upassword;
        this.email = email;
    }

    public User(Integer uid, String uname, String upassword, String email, String uimg, Integer gender, String uinfo) {
        this.uid = uid;
        this.uname = uname;
        this.upassword = upassword;
        this.email = email;
        this.uimg = uimg;
        this.gender = gender;
        this.uinfo = uinfo;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    public String getUimg() {
        return uimg;
    }

    public void setUimg(String uimg) {
        this.uimg = uimg;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getUinfo() {
        return uinfo;
    }

    public void setUinfo(String uinfo) {
        this.uinfo = uinfo;
    }
}
