package com.dong.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * @Description:
 * @Author: zjdong
 * @Date: 2021/5/26.
 */
public class TestMain {
    public static void main(String[] args) {
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        HelloWord helloWorld = (HelloWord)classPathXmlApplicationContext.getBean("helloWorld");
        helloWorld.sayHello();
        System.out.println(helloWorld);
    }
}
