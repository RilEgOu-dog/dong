package com.dong.beans;

/*
 * @Description:
 * @Author: zjdong
 * @Date: 2021/5/26.
 */
public class HelloWord {
    private String userName;
    private String userAge;

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public HelloWord() {
    }

    public HelloWord(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return userName+"的年龄是："+userAge;
    }

    public void sayHello(){
        System.out.println("say hello,"+userName+"的年龄是:"+userAge);
    }
}
