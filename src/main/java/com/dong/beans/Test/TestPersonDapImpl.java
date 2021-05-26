package com.dong.beans.Test;

import com.dong.beans.HelloWord;
import com.dong.beans.service.PersonDao;
import com.dong.beans.service.PersonService;
import com.dong.beans.serviceImpl.Constructor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * @Description:
 *
 *
 * @Author: zjdong
 * @Date: 2021/5/26.
 */
public class TestPersonDapImpl {
    public static void main(String[] args) {
        String xml = "ApplicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);

        PersonDao person = (PersonDao)ac.getBean("person");
        person.add();
        PersonService personService1 = (PersonService)ac.getBean("personService1");
        personService1.addPerson();

        PersonService personService2 = (PersonService)ac.getBean("personService2");
        personService2.addPerson();


        Constructor constructor = (Constructor)ac.getBean("constructor");
        constructor.sayAge();

    }
}
