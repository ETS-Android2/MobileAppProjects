package com.example.foodrescueapp.model;

public class User {
    private String email;
    private String password;
    private String fullName;
    private String phone;
    private String address;
    private int token;

    public User() { }

    public User(String email, String fullName, String phone, String address) {
        this.email = email;
        this.fullName = fullName;
        this.phone = phone;
        this.address = address;
    }

    public User(String email, String password, String fullName, String phone, String address) {
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.phone = phone;
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getToken() {
        return token;
    }

    public void setToken(int token) {
        this.token = token;
    }
}
