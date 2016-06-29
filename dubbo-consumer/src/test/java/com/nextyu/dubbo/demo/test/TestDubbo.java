package com.nextyu.dubbo.demo.test;

import com.nextyu.dubbo.demo.service.DemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * created on 2016-06-29 21:21
 *
 * @author smile
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dubbo-consumer.xml")
public class TestDubbo {

    @Autowired
    private DemoService demoService;

    @Test
    public void test1() {
        String hello = demoService.sayHello("小明");
        System.out.println(hello);
    }



}
