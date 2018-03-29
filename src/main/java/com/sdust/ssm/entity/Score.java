package com.sdust.ssm.entity;

import java.util.Date;

/**
 * Created by LiuYuanZhe on 18/3/9.
 */
public class Score {
    private int id;
    private String changeType;
    private Date createTime;
    private Integer score;
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChangeType() {
        return changeType;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Score(){}

    public Score(int id, String changeType, Date createTime, Integer score) {
        this.id = id;
        this.changeType = changeType;
        this.createTime = createTime;
        this.score = score;
    }
}
