package com.siping.Identify.bean;

public class Identify {
    private int id;
    private int userId;
    private String address;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getAddress() {
        return address;
    }
    @Override
    public String toString() {
        return "Identify [id=" + id + ", userId=" + userId + ", address=" + address + "]";
    }
    
}
