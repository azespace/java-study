package com.xmspace.javastudy.stream4j.constructionmethodreference;

import java.util.function.Supplier;

/**
 * @description: 构造方法引用
 * @author: 小明长高高
 * @date: 2024/7/31 22:19
 **/
public class Client {
    public static void main(String[] args) {
        // 构造方法lambda表达式
        Supplier<Person> supplier = () -> new Person();
        Person person = supplier.get();
        // 构造方法引用
        Supplier<Person> supplier2 = Person::new;
        Person person2 = supplier2.get();
    }
}
