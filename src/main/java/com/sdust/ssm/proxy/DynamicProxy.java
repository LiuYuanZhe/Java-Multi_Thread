package com.sdust.ssm.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by LiuYuanZhe on 18/3/27.
 */
public class DynamicProxy implements InvocationHandler{
    private Object object;
    public DynamicProxy(Object target){
        this.object = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(object,args);
        after();
        return result;
    }

//    @SuppressWarnings("unchecked")
//    public <T> T getProxy(){
//        return <T>
//    }

    private void after() {

    }

    private void before() {

    }
}
