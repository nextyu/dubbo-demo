package com.nextyu.dubbo.demo.provider;

import com.nextyu.dubbo.demo.service.DemoService;

/**
 * created on 2016-06-29 20:53
 *
 * @author smile
 */
public class DemoServiceImpl implements DemoService {
    public String sayHello(String hello) {
        return "Hello " + hello;
    }
}
