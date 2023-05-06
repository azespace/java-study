package com.xmspace.javastudy.stream4j;

import com.xmspace.javastudy.pojo.Hobby;
import com.xmspace.javastudy.pojo.Man;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * There is plenty of fish in the sea
 *
 * @Author XM  2023/05/06
 * Description:
 **/
public class Step01 {
    static Man xm;
    static Man xh;

    static {
        xm = Man.builder().build();
        List<Hobby> hobbyList = new ArrayList<>();
        Hobby hobby = Hobby.builder().build();
        hobbyList.add(hobby);
        xh = Man.builder().name("小红").age(19).hobbies(hobbyList).build();
    }

    static void test01() {
        System.out.println(xh);
    }

    public static void main(String[] args) {
        test01();
    }

}
