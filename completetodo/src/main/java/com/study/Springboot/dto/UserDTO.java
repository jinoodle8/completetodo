package com.study.Springboot.dto;

public class UserDTO {

    private int user_id;
    private String id;
    private String pw;
    private String name;


    // getters and setters
    public int getUser_id() {
        return user_id;
    }
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getPw() {
        return pw;
    }
    public void setPw(String pw) {
        this.pw = pw;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    // tostring
    @Override
    public String toString() {
        return "UserDTO [user_id=" + user_id + ", id=" + id + ", pw=" + pw + ", name=" + name + "]";
    }



}