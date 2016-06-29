package com.nextyu.dubbo.demo.test;

import com.nextyu.dubbo.demo.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * created on 2016-06-29 21:25
 *
 * @author smile
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-dubbo-consumer.xml");
        context.start();

        DemoService demoService = (DemoService)context.getBean("demoService"); // 获取远程服务代理
        String hello = demoService.sayHello("world"); // 执行远程方法

        System.out.println( hello ); // 显示调用结果
    }
}
