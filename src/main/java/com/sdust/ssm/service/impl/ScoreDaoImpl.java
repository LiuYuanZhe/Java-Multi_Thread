package com.sdust.ssm.service.impl;

import com.sdust.ssm.dao.ScoreDao;
import com.sdust.ssm.entity.Score;
import com.sdust.ssm.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by LiuYuanZhe on 18/3/17.
 */
public class ScoreDaoImpl implements ScoreService {

    @Autowired
    private ScoreDao scoreDao;

    public int insertScore(Score score) {
        int t =scoreDao.insertScore(score);
        return t;
    }
}
