package com.sdust.ssm.controller;

import com.sdust.ssm.po.Test;
import com.sdust.ssm.service.TestService;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by LiuYuanZhe on 17/12/17.
 */
@Controller
@RequestMapping(value = "/test")
public class DemoController {
    @Autowired
    TestService testService;

    @RequestMapping(value = "/testdemo",method = {RequestMethod.POST,RequestMethod.GET})
    public ModelAndView test01(){
        Test test = testService.getTest();
        ModelAndView modelAndView = new ModelAndView();
        System.out.println("################");
        modelAndView.addObject("test",test);
        modelAndView.setViewName("test");
        return modelAndView;
    }

}
