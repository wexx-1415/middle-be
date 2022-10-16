package com.example.test.controller;

public class Login {
    private String userType;
    private String userName;

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Login{" +
                "userType='" + userType + '\'' +
                ", userName='" + userName + '\'' +
                ", userId=" + userId +
                '}';
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    private int userId;

    public Login(String userType, String userName, int userId) {
        this.userType = userType;
        this.userName = userName;
        this.userId = userId;
    }
}
