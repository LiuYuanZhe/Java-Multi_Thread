package com.sdust.ssm.servlet;

import com.sdust.ssm.entity.User;
import com.sdust.ssm.service.impl.UserDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * Created by LiuYuanZhe on 18/3/20.
 */
@WebServlet("/userServlet")
public class UserInsertServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();
//        account,country,score,province,sex,`password`
        user.setAccount((String) request.getAttribute("account"));
        user.setCountry((String) request.getAttribute("country"));
        user.setScore(Integer.parseInt((String) request.getAttribute("score")));
        user.setProvince((String) request.getAttribute("province"));
        user.setSex((String) request.getAttribute("sex"));
        user.setPassword((String) request.getAttribute("password"));
        UserDaoImpl userDao = new UserDaoImpl();
        int i = userDao.insert(user);
        System.out.println(i);
        request.getRequestDispatcher("/allUser").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
