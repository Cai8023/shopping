package com.pojo;

import java.sql.Blob;

/**
 * @author CaiKe
 * @create 2020/10/16
 */
public class User {
    private int userId;
    private String account;
    private String name;
    private String phone;
    private String password;
    private String email;
    private String qq;
    private String gender;
    private float balance = 0.0f;
    private int credit = 0;
    private int authority = 1;
    private Blob photo;

    public User() {
    }

    public User(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public User(int userId, String account, String name, String phone, String password, String email, String qq, String gender, float balance, int credit, int authority, Blob photo) {
        this.userId = userId;
        this.account = account;
        this.name = name;
        this.phone = phone;
        this.password = password;
        this.email = email;
        this.qq = qq;
        this.gender = gender;
        this.balance = balance;
        this.credit = credit;
        this.authority = authority;
        this.photo = photo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("userId=").append(userId);
        sb.append(", account='").append(account).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", phone='").append(phone).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", qq='").append(qq).append('\'');
        sb.append(", gender='").append(gender).append('\'');
        sb.append(", balance=").append(balance);
        sb.append(", credit=").append(credit);
        sb.append(", authority=").append(authority);
        sb.append('}');
        return sb.toString();
    }

    public int getUserId() {
        return userId;
    }

    public Blob getPhoto() {
        return photo;
    }

    public void setPhoto(Blob photo) {
        this.photo = photo;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getAuthority() {
        return authority;
    }

    public void setAuthority(int authority) {
        this.authority = authority;
    }
}