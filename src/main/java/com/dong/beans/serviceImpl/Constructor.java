package com.dong.beans.serviceImpl;

/*
 * @Description:
 * @Author: zjdong
 * @Date: 2021/5/26.
 */
public class Constructor {
    private Integer age;

    public void setAge(Integer age) {
        this.age = age;
    }

    public Constructor() {
    }

    public void sayAge(){
        System.out.println("age = "+ age);
    }
}
