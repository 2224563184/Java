package com.bjpowe.Test;

public class User {
    private Integer user;
    private String pass;

    public User() {
    }


    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
      return user+","+pass;    }
}
