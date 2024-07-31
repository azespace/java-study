package com.xmspace.javastudy.stream4j.staticmethodreference;

import java.util.Arrays;

/**
 * @description: 静态方法引用
 * @author: 小明长高高
 * @date: 2024/7/31 21:38
 **/
public class Client {
    public static void main(String[] args) {
        Person[] list = new Person[3];
        // 第二个参数是一个函数式接口 接收一个Comparator对象
        Arrays.sort(list, new Person());
        // lambda表达式
        Arrays.sort(list,(a,b)->a.getAge().compareTo(b.getAge()));
        // 静态方法lambda表达式 这里为啥可以传Person.compareByAge呢？
        // 只看参数不看方法名，Comparator有个函数式接口compare，接收两个参数，返回int
        // compareByAge方法也是接收两个参数，返回int，所以可以替换使用！
        // compareByAge的return a.getAge().compareTo(b.getAge());被当做了compare的实现
        Arrays.sort(list,(a,b)->Person.compareByAge(a,b));
        // 静态方法引用
        // 不看方法名，只看参数，Person::compareByAge和Comparator的compare方法参数一致，并且返回值也一致，所以可以替换使用！
        Arrays.sort(list,Person::compareByAge);
    }
}
