package com.flame.pojo;

public class User {
    private Integer userId;

    private String userName;

    private String userPwd;

    private Boolean userSuper;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public Boolean getUserSuper() {
        return userSuper;
    }

    public void setUserSuper(Boolean userSuper) {
        this.userSuper = userSuper;
    }
}
