package com.xmspace.javastudy.stream4j.instancemethodreference;

import java.util.function.Supplier;

/**
 * @description: 实例方法引用
 * @author: 小明长高高
 * @date: 2024/7/31 21:38
 **/

public class Client {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("icanci");
        person.setAge(18);
        // 实例方法lambda表达式
        // Supplier是函数式接口T get(); 无参数，返回T 而Person::getName也是无参数，返回T 所以可以替换使用！
        Supplier<String> supplier = () -> person.getName();
        System.out.println(supplier.get());
        // 实例方法方法引用
        Supplier<String> supplier2 = person::getName;
        System.out.println(supplier2.get());
    }
}
