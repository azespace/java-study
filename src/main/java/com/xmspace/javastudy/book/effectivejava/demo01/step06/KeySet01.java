package com.xmspace.javastudy.book.effectivejava.demo01.step06;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * There is plenty of fish in the sea
 *
 * @Author XM  2023/12/22
 * Description:
 **/
public class KeySet01 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        Set<String> keySet1 = map.keySet();
        Set<String> keySet2 = map.keySet();

        System.out.println("Are keySet1 and keySet2 the same instance? " + (keySet1 == keySet2));
        System.out.println("keySet1: " + keySet1);
        System.out.println("keySet2: " + keySet2);

        map.put("D", 4);

        System.out.println("After adding a new entry to the map:");
        System.out.println("keySet1: " + keySet1);
        System.out.println("keySet2: " + keySet2);
    }
}
