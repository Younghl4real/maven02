package com.yhl.pojo;

public class MyUser
{
    private String uname;
    private String usex;
    private Integer uid;

    public MyUser() {
    }

    public MyUser(String uname, String usex, Integer uid) {
        this.uname = uname;
        this.usex = usex;
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}
