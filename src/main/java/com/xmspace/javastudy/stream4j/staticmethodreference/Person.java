package com.xmspace.javastudy.stream4j.staticmethodreference;

import lombok.Data;

import java.util.Comparator;

/**
 * @description:
 * @author: 小明长高高
 * @date: 2024/7/31 21:32
 **/
@Data
public class Person implements Comparator<Person> {
    private String name;
    private Integer age;
    public static int compareByAge(Person a, Person b) {
        return a.getAge().compareTo(b.getAge());
    }
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge().compareTo(o2.getAge());
    }
}
