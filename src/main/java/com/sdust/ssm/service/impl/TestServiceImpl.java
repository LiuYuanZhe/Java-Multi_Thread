package com.sdust.ssm.service.impl;

import com.sdust.ssm.po.Test;
import com.sdust.ssm.service.TestService;
import org.springframework.stereotype.Component;

/**
 * Created by LiuYuanZhe on 17/12/17.
 */
@Component
public class TestServiceImpl implements TestService {
    public Test getTest() {
        Test test = new Test();
        test.setId(1);
        test.setDescription("testDemo");
        test.setCreate_user("12312");
        return test;
    }

    public static void main(String[] args) {
    }
}
