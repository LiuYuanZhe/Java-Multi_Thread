package com.sdust.ssm.po;

/**
 * Created by LiuYuanZhe on 17/12/17.
 */
public class Student {
    private String id;
    private String name;
    private String age;
    private String sex;
    private String memo;
    public String toString(){
        return this.name +"###"+this.age;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
