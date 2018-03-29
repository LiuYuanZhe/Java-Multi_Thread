package com.sdust.ssm.entity;

import java.util.Date;

/**
 * Created by LiuYuanZhe on 18/3/18.
 */
public class Gag {
    private long id;
    private Date createTime;
    private Date gagTime;
    private User user;

    @Override
    public String toString() {
        return "Gag{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", gagTime=" + gagTime +
                ", user=" + user +
                '}';
    }

    public Gag(){}

    public Gag(long id, Date createTime, Date gagTime, User user) {
        this.id = id;
        this.createTime = createTime;
        this.gagTime = gagTime;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getGagTime() {
        return gagTime;
    }

    public void setGagTime(Date gagTime) {
        this.gagTime = gagTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
