package com.xmspace.javastudy.clazz;

/**
 * @description:
 * @author: 小明长高高
 * @date: 2023/7/8 22:11
 **/
public class Integerz {

    private static void doing(Integer i ){
        i = i+1;
    }
    public static void main(String[] args) {
        Integer i = 1;
        doing(i);
        System.out.println(i);
        Object o1 = true ? 1 : "Hello";
        System.out.println(o1);//1.0
    }
}
