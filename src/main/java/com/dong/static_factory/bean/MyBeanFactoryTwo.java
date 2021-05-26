package com.dong.static_factory.bean;

import com.dong.beans.HelloWord;

/*
 * @Description:
 * @Author: zjdong
 * @Date: 2021/5/26.
 */
public class MyBeanFactoryTwo {
    public MyBeanFactoryTwo() {
        System.out.println("工厂实例化");
    }
    public HelloWord createBean(){
        return new HelloWord();
    }
}
