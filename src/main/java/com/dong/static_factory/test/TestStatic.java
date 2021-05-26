package com.dong.static_factory.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * @Description:
 * @Author: zjdong
 * @Date: 2021/5/26.
 */
public class TestStatic {
    public static void main(String[] args) {
        String xml = "ApplicationContextStatic.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        Object person2 = ac.getBean("person2");
        System.out.println(person2);

        Object person3 = ac.getBean("person3");
        System.out.println(person3);
    }
}
