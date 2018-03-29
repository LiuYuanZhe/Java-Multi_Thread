package com.sdust.ssm.test;

import com.sdust.ssm.dao.GagDao;
import com.sdust.ssm.dao.ScoreDao;
import com.sdust.ssm.dao.UserDao;
import com.sdust.ssm.entity.Gag;
import com.sdust.ssm.entity.Score;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by LiuYuanZhe on 18/3/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring/applicationContext-*.xml")
public class MybatisTest {

    @Autowired
    private ScoreDao scoreDao;

    @Autowired
    private GagDao gagDao;

    @Autowired
    private UserDao userDao;

    @Test
    public void sayHello(){
        System.out.println("hello");
        System.out.println(userDao.findAllUser().size());
    }

    @Test
    public void addAddScore(){
        System.out.println("test");
//        Score score = new Score();
//        score.setChangeType("充钱lyz20180317");
//        score.setScore(10);
//        int insert = scoreDao.insertScore(score);
//        System.out.println("score insert "+insert);
    }
    @Test
    public void addGag(){
        System.out.println(new Date());
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        Gag gag = new Gag();
        gag.setId(123456);
        gag.setGagTime(new Date());
        int insert = gagDao.insertGag(gag);
        System.out.println("insert:"+insert);
    }

    @Test
    public void findGagList(){
        List<Gag> list = gagDao.findAll();
        System.out.println(list.size());
        System.out.println(list.get(0).toString());
    }

}
