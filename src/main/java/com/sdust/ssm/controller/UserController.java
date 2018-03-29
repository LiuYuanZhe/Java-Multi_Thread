package com.sdust.ssm.controller;

import com.sdust.ssm.dao.UserDao;
import com.sdust.ssm.entity.User;
import com.sdust.ssm.entity.UserForm;
import com.sdust.ssm.service.impl.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by LiuYuanZhe on 18/3/20.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    UserDao userDao;

    @RequestMapping(value = "/allUsers",method = {RequestMethod.POST,RequestMethod.GET})
    public ModelAndView findAllUsers(){
        List list = userDao.findAllUser();
        ModelAndView mov = new ModelAndView();
        mov.addObject("users",list);
        mov.setViewName("allUser");
        return mov;
    }

    @RequestMapping(value = "/addView",method = {RequestMethod.POST,RequestMethod.GET})
    public ModelAndView test02(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("UserServlet");
        return modelAndView;
    }

//    @RequestParam(value = "account",required = false) String account)

    @RequestMapping(value = "/addUser.do",method = {RequestMethod.POST,RequestMethod.GET})
    @ResponseBody
    public String addUser(HttpServletRequest request, HttpSession session,@ModelAttribute(value = "account") String account, @ModelAttribute UserForm userForm){
        System.out.println("进入add方法");
        System.out.println(userForm.toString());
        User user = new User();
        user.setAccount(userForm.getAccount());
        user.setProvince(userForm.getProvince());
        user.setSex(userForm.getSex());
        user.setCountry(userForm.getCountry());
        System.out.println(user.toString());
        int i = userDao.insert(user);
        if (i==1)return "插入成功";
        else return "插入失败";
    }
}
