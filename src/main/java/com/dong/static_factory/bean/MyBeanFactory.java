package com.dong.static_factory.bean;

import com.dong.beans.HelloWord;
import com.dong.beans.service.PersonDao;

/*
 * @Description:
 * @Author: zjdong
 * @Date: 2021/5/26.
 */
public class MyBeanFactory {
    public static HelloWord createBean(){
        return new HelloWord();
    }
}
