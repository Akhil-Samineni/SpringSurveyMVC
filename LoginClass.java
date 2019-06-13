package com.uhcl.model;


import org.springframework.stereotype.Component;

@Component
public class LoginClass {
    private int username;
    private String password;
    private  String group;
    public LoginClass(){}


    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getUsername() {
        return username;
    }

    public void setUsername(int username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
