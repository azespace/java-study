package com.xmspace.javastudy.clazz;

/**
 * @description:
 * @author: 小明长高高
 * @date: 2023/6/3 12:16
 **/
public class Clazz1 {
    String name ;
    // 1.this可以调用构造方法,实现构造方法之间的互相调用
    Clazz1(){
        this("小明");
    }
    Clazz1(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        // 2.调用其他方法 但是不可以调用构造方法，因为构造方法只在初始化的时候被调用
        this.getName();
        // 3.左边的name是成员变量,右边的是局部变量,this可以区分局部还是成员。
        this.name = name;
        // 4.子类继承父类后，可以使用子类.方法名访问父类的静态方法。
        Student.getName();
        // 5.多态性
        Person p = new Student();
        // 6. p.play 报错因为父类没有,父类有的话执行的就是子类的方法。提高了扩展性，不同的子类执行不同的方法
        // 7. 成员变量不会被重写，会遵循就近原则
        p.setName("!");
    }
}
