package com.sdust.ssm.entity;

import java.util.Date;

/**
 * Created by LiuYuanZhe on 18/3/17.
 */
public class User {
    //用户id
    private int id;
    //账号
    private String account;
    //头像
    private String avatar;
    //充值总额
    private int payMoney;
    //国家
    private String country;

    //用户创建时间
    private Date createTime;
    //积分
    private int score;

    //所在纬度
    private Double latitude;
    //所在经度
    private Double longitude;
    //省份
    private String province;
    //用户性别，F:女，M:男
    private String sex;
    //密码
    private String password;

    public User() {}

    public User(int id, String account, String avatar, int payMoney, String country, Date createTime, int score, Double latitude, Double longitude, String province, String sex, String password) {
        this.id = id;
        this.account = account;
        this.avatar = avatar;
        this.payMoney = payMoney;
        this.country = country;
        this.createTime = createTime;
        this.score = score;
        this.latitude = latitude;
        this.longitude = longitude;
        this.province = province;
        this.sex = sex;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(int payMoney) {
        this.payMoney = payMoney;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", country='" + country + '\'' +
                ", score=" + score +
                ", province='" + province + '\'' +
                '}';
    }
}
