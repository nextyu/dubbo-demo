package com.nextyu.dubbo.demo.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * created on 2016-06-29 22:00
 *
 * @author smile
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-dubbo-provider.xml");
        context.start();

        System.out.println("启动啦.");

        try {
            System.in.read(); // 按任意键退出
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
