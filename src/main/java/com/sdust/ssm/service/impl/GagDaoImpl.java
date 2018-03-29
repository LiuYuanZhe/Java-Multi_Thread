package com.sdust.ssm.service.impl;

import com.sdust.ssm.dao.GagDao;
import com.sdust.ssm.entity.Gag;
import com.sdust.ssm.service.GagService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by LiuYuanZhe on 18/3/18.
 */
public class GagDaoImpl implements GagService {
    @Autowired
    GagDao gagDao;
    @Override
    public int insertGag(Gag gag) {
        int i = gagDao.insertGag(gag);
        return i;
    }

    @Override
    public List<Gag> findByUserId(Long id) {
        List<Gag> gagList = gagDao.findByUserId(id);
        return gagList;
    }

    @Override
    public List<Gag> findAll() {
        List <Gag> gagList = gagDao.findAll();
        return gagList;
    }
}
