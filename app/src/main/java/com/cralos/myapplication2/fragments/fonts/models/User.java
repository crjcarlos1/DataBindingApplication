package com.cralos.myapplication2.fragments.fonts.models;

public class User {

    private String userName;
    private String email;
    private String job;

    public User(String userName, String email, String job) {
        this.userName = userName;
        this.email = email;
        this.job = job;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

}
