package com.dong.beans.serviceImpl;

import com.dong.beans.service.PersonDao;
import com.dong.beans.service.PersonService;

/*
 * @Description:
 * @Author: zjdong
 * @Date: 2021/5/26.
 */
public class PersonDaoImpl implements PersonDao  {

    public void add() {
        System.out.println("add()方法执行了");
    }
}
