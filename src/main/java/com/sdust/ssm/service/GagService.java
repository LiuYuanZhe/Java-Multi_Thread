package com.sdust.ssm.service;

import com.sdust.ssm.entity.Gag;

import java.util.List;

/**
 * Created by LiuYuanZhe on 18/3/18.
 */
public interface GagService {
    public int insertGag(Gag gag);
    List<Gag> findByUserId(Long id);
    List<Gag> findAll();
}
