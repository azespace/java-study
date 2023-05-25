package com.xmspace.javastudy.stream4j;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties;

import java.util.*;
import java.util.stream.Stream;

/**
 * There is plenty of fish in the sea
 *
 * @Author XM  2023/05/11
 * Description: 流的创建 stream
 **/
public class Step03 {
    public static void main(String[] args) {
        //1.单例集合可以调用stream方法创建 一些工具也可以 Arrays的stream
        List<Integer> list = new ArrayList<>();
        Stream<Integer> stream = list.stream();
        //2.Stream接口有方法可以实现
        Stream<int[]> stream1 = Stream.of(new int[0]);
        //3.双列集合创建需要先转成单例集合
        Map<String,String> map = new HashMap<>();
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> stream2 = entries.stream();
    }
}
