package com.sdust.ssm.service.impl;

import com.sdust.ssm.dao.UserDao;
import com.sdust.ssm.db.DBUtils;
import com.sdust.ssm.entity.User;
import com.sdust.ssm.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sun.applet.Main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by LiuYuanZhe on 18/3/20.
 */
@Component
public class UserDaoImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findById(int id) {
        User user = userDao.findById(id);
        return user;
//        PreparedStatement pstm = null;
//        ResultSet rs = null;
//        String sql = "select * from testdemo where id=?";
//        Map row = null;
//        try {
//            pstm = DBUtils.prepareStatement(sql);
//            pstm.setObject(1,id);
//            rs = pstm.executeQuery();
//            ResultSetMetaData rsmd = rs.getMetaData();
//            int count = rsmd.getColumnCount();
//            int initSize = ((int)(count/0.75))+1;
//            row = new HashMap(initSize);
//            if (rs.next()){
//                for (int i = 1;i<count;i++){
//                    row.put(rsmd.getColumnLabel(i),rs.getString(i));
//                }
//            }
//            System.out.println(row.toString());
//            return row;
//        }catch (Exception e){
//            System.out.println("dindById出现异常了");
//            e.printStackTrace();
//        }finally {
//            DBUtils.close(rs);
//            DBUtils.close(pstm);
//        }
    }

    @Override
    public List<User> findAllUser() {
        List<User> users = userDao.findAllUser();
        return users;
//        PreparedStatement pstm = null;
//        ResultSet rs = null;
//        String sql = "select * from userdemo";
//        try {
//            pstm = DBUtils.prepareStatement(sql);
//            rs = pstm.executeQuery();
//            ResultSetMetaData rsmd = rs.getMetaData();
//            int count = rsmd.getColumnCount();
//            int initSize = ((int)(count/0.75))+1;
//            List<Map> rows = new ArrayList<Map>();
//            Map row = null;
//            while (rs.next()){
//                row = new HashMap(initSize);
//                for (int i = 1;i<count;i++){
//                    row.put(rsmd.getColumnLabel(i),rs.getString(i));
//                }
//                rows.add(row);
//            }
//            System.out.println(rows.size());
//            return rows;
//        }catch (Exception e){
//            System.out.println("dindById出现异常了");
//            e.printStackTrace();
//        }finally {
//            DBUtils.close(rs);
//            DBUtils.close(pstm);
//        }
//        return null;
    }

    @Override
    public int insert(User user) {
        int i = userDao.insert(user);
        return i;
//        PreparedStatement pstm = null;
//        String sql = "insert into `userdemo`(account,country,score,province,sex,`password`)" +
//                " VALUES(?,?,?,?,?,?)";
//        try {
//            pstm = DBUtils.prepareStatement(sql);
//            pstm.setObject(1,user.getAccount());
//            pstm.setObject(2,user.getCountry());
//            pstm.setObject(3,user.getScore());
//            pstm.setObject(4,user.getProvince());
//            pstm.setObject(5,user.getSex());
//            pstm.setObject(6,user.getPassword());
//            int i = pstm.executeUpdate();
//            System.out.println(i);
//            return i;
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return 0;
    }

    @Override
    public int deleteById(int id) {
        PreparedStatement pstm = null;
        String sql = "delete from userdemo where id=?";
        try {
            pstm = DBUtils.prepareStatement(sql);
            pstm.setObject(1,id);
            int i = pstm.executeUpdate();
            System.out.println(i);
            return i;
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int UpdateById(User user) {
        PreparedStatement pstm = null;
        String sql = "update userdemo a set a.account=? and a.country=? " +
                "and a.score=? and a.sex=? and a.`password`=? " +
                "where a.id=?";
        try {
            pstm = DBUtils.prepareStatement(sql);
            pstm.setObject(1,user.getAccount());
            pstm.setObject(2,user.getCountry());
            pstm.setObject(3,user.getScore());
            pstm.setObject(4,user.getSex());
            pstm.setObject(5,user.getPassword());
            pstm.setObject(6,user.getId());
            int i = pstm.executeUpdate();
            System.out.println(i);
            return i;
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    public static void main(String[] args) {
        UserDaoImpl userDao = new UserDaoImpl();
        List list = userDao.findAllUser();
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i).toString());
        }
//        User user = userDao.findById(1);
//        System.out.println(list.size());
//        User user = new User();

//        user.setAccount("123421");
//        user.setPassword("887733");
//        user.setSex("男");
//        user.setScore(99);
//        user.setProvince("山东");
//        user.setCountry("中国");
//        int i = userDao.insert(user);
//        int i = userDao.deleteById(3);
//        System.out.println("insert:"+i);
    }
}
