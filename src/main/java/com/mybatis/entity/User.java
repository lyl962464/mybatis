package com.mybatis.entity;

import java.io.Serializable;

public class User implements Serializable{
    /***
     * 姓名
     */
    private String username;
    /***
     * 密码
     */
    private String password;
    /***
     * 联系方式
     */
    private String phone;

    @Override
    public String toString() {
        return super.toString();
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
