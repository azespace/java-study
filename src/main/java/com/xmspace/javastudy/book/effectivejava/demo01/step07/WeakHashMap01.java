package com.xmspace.javastudy.book.effectivejava.demo01.step07;

import java.util.Objects;
import java.util.WeakHashMap;

/**
 * There is plenty of fish in the sea
 *
 * @Author XM  2024/01/04
 * Description:
 **/
public class WeakHashMap01 {
    public static void main(String[] args) {
        WeakHashMap<String, String> map = new WeakHashMap<>();
        String s1 = new String("1");
        String s2 = new String("2");
        map.put(s1,"1");
        map.put(s2,"2");
        System.out.println(map.get(s1)); // 输出 1
        System.out.println(map.get(s2)); // 输出 2
        s1 = null;
        System.out.println(map.get(s1)); // 输出 null
        System.out.println(map.get(s2)); // 输出 2
    }
}
