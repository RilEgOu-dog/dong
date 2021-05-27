package com.dong.scope;

import org.springframework.beans.factory.BeanNameAware;

/*
 * @Description:
 * @Author: zjdong
 * @Date: 2021/5/27.
 */
public class Person implements BeanNameAware {

    public void setBeanName(String s) {
        System.out.println("bean的名字是："+s);
    }
}
