package com.uhcl.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name="userTable")
@Component
public class LoginHibernate {

    @Id
    @Column(name="user_id")
    private int user_id;

    @Column(name="userName")
    private String userName;

    @Column(name="pass")
    private String pass;

    @Column(name="groupName")
    private String groupName;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "LoginHibernate{" +
                "user_id=" + user_id +
                ", userName='" + userName + '\'' +
                ", pass='" + pass + '\'' +
                ", groupName='" + groupName + '\'' +
                '}';
    }
}
