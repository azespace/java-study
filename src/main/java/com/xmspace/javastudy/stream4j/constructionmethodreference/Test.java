package com.xmspace.javastudy.stream4j.constructionmethodreference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test {
    // 你会惊喜的发现你不需要为每个不同的筛选条件写一个方法，只需要传递一个Predicate对象即可
    // 这将会为你省下很多时间
    public static void main(String[] args) {
        System.out.println(filterApples(Person.getPersonList(), (Person a) -> "green".equals(a.getName())));
        System.out.println(filterApples(Person.getPersonList(), (Person a) -> a.getAge() > 150));
    }
    public static List<Person> filterApples(List<Person> apples, Predicate<Person> predicate) {
        List<Person> arrayList = new ArrayList<>();
        for (Person apple : apples) {
            if (predicate.test(apple)) {
                arrayList.add(apple);
            }
        }
        return arrayList;
    }
}