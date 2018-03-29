package com.sdust.ssm.controller;

import com.alibaba.fastjson.JSONArray;
import com.sdust.ssm.entity.Gag;
import com.sdust.ssm.service.GagService;
import com.sdust.ssm.service.JedisClient;
import com.sdust.ssm.utils.JsonUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by LiuYuanZhe on 18/3/18.
 */
@Controller
@RequestMapping(value = "/gag")
public class GagController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private GagService gagService;
    @Autowired
    private JedisClient jedisClient;

    @RequestMapping(value = "/test")
    @ResponseBody
    public String test(){
        System.out.println("test successful");
        return "true";
    }

    @RequestMapping(value = "/testRedis",produces = "text/html;charset=UTF-8",method = {RequestMethod.POST,RequestMethod.GET})
    public String testRedis(Long id){
        List<Gag> gagList = null;
        try {
            String resulthget = jedisClient.hget("禁言表",id + "");
            if (resulthget != null){
                logger.info("有缓存了");
                System.out.println("有缓存了");
                JSONArray array = JSONArray.parseArray(resulthget);
                gagList = (List) array;
            }else {
                System.out.println("禁言表未查");
                gagList = gagService.findByUserId(id);
            }
        }catch (Exception e){
//            logger.error("出现了错误");
            e.printStackTrace();
        }
        try {
            String cacheString = JsonUtils.objectToJson(gagList);
            jedisClient.hset("禁言表",id +"", cacheString);
            System.out.println("111111");
        }catch (Exception e){
            e.printStackTrace();
        }
        return JSONArray.toJSONString(gagList);
    }
}
