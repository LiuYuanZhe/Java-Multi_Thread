package com.sdust.ssm.servlet;

import com.sdust.ssm.entity.User;
import com.sdust.ssm.service.impl.UserDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by LiuYuanZhe on 18/3/20.
 */
public class UsersServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();
//        account,country,score,province,sex,`password`
        UserDaoImpl userDao = new UserDaoImpl();
        List list = userDao.findAllUser();
        System.out.println(list.size());
        request.setAttribute("users",list);
        request.getRequestDispatcher("/allUser").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
