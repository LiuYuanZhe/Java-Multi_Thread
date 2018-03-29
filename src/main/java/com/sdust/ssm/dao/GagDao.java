package com.sdust.ssm.dao;

import com.sdust.ssm.entity.Gag;

import java.util.List;

/**
 * Created by LiuYuanZhe on 18/3/18.
 */
public interface GagDao {
    public int insertGag(Gag gag);
    List<Gag> findByUserId(Long id);
    List<Gag> findAll();
}
