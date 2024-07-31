package com.xmspace.javastudy.stream4j.constructionmethodreference;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: 小明长高高
 * @date: 2024/7/31 21:32
 **/
@Data
public class Person {
    private String name;
    private Integer age;

    public static List<Person> getPersonList(){
        return new ArrayList<>();
    }
}
