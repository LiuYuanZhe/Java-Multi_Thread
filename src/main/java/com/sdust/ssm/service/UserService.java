package com.sdust.ssm.service;

import com.sdust.ssm.entity.User;

import java.util.List;
import java.util.Map;

/**
 * Created by LiuYuanZhe on 18/3/20.
 */
public interface UserService {
    public User findById(int id);
    public List<User> findAllUser();
    public int insert(User user);
    public int deleteById(int id);
    public int UpdateById(User user);
}
