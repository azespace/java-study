package com.xmspace.javastudy.clazz;

/**
 * @description: 对象和类
 * @author: 小明长高高
 * @date: 2023/6/3 11:33
 **/
public class Clazz {
    //1.可以定义类变量给默认值或者不给
    public static int a = 3;
    public static int l = 3;
    public Clazz() {
    }
    public Clazz(int c) {
        this.c = c;
    }

    static int b;
    //2.可以定义实例变量给默认值或者不给
    int c = 1;
    int d;
    //3.静态代码块可以给成员变量(类变量或者实例变量)赋值或者做其他事情在类加载的时候加载
    static{
        int v = 1;
    }
    {

    }
    public void  xx(){
        //实例访问静态
        Student s = new Student();
        String l1 = s.age;
        System.out.println(l1);
    }
    public static void test1(int b){
        final int l = 1;
        b = 1;
        b = 2;
        System.out.println(b);
    }

    public static void main(String[] args) {
        int a = 1;
        new Runnable(){
            @Override
            public void run() {
                System.out.println(a);
            }
        };
    }
}
