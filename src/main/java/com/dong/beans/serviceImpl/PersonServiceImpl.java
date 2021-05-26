package com.dong.beans.serviceImpl;

import com.dong.beans.HelloWord;
import com.dong.beans.service.PersonDao;
import com.dong.beans.service.PersonService;

/*
 * @Description:
 * @Author: zjdong
 * @Date: 2021/5/26.
 */
public class PersonServiceImpl implements PersonService {
    private PersonDao personDao;
    private HelloWord helloWord;

    public void setHelloWord(HelloWord helloWord) {
        this.helloWord = helloWord;
    }

    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

    public void addPerson() {
        personDao.add();
        helloWord.sayHello();
        System.out.println("PersonService中addPersion()执行了");
    }
}
