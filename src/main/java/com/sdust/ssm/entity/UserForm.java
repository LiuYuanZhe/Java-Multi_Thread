package com.sdust.ssm.entity;

/**
 * Created by LiuYuanZhe on 18/3/21.
 */
public class UserForm {
    private String account;

    private String country;

    private String province;

    private String sex;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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

    @Override
    public String toString() {
        return "UserForm{" +
                "account='" + account + '\'' +
                ", country='" + country + '\'' +
                ", province='" + province + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
