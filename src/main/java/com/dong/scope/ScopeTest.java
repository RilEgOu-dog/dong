package com.dong.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/*
 * @Description:
 * @Author: zjdong
 * @Date: 2021/5/27.
 */
public class ScopeTest {
    public static void main(String[] args) {
        String xml = "ApplicationContextScope.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        System.out.println(ac.getBean("person"));
        System.out.println(ac.getBean("person"));

        System.out.println(ac.getBean("person2"));
        System.out.println(ac.getBean("person2"));



    }
}
