package com.nextyu.dubbo.demo.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * created on 2016-08-29 10:06
 *
 * @author nextyu
 */
public class ProviderWithAnnotation {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-dubbo-provider-with-annotation.xml");
        context.start();

        System.in.read(); // 按任意键退出
    }
}
