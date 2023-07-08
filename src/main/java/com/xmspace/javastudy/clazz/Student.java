package com.xmspace.javastudy.clazz;

/**
 * @description:
 * @author: 小明长高高
 * @date: 2023/6/20 21:48
 **/
public class Student extends Person{
    private String name;

    public static String age ="1";

    public void play(){
        getName();
    }

    public  String getAge() {
        return age;
    }

    public  void setAge(String age) {
        Student.age = age;
    }

    @Override
    public void setName(String name) {
        this.name = "1";
        super.setName("2");
    }

}
