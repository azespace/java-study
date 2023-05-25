package com.xmspace.javastudy.stream4j;

import com.xmspace.javastudy.pojo.Man;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * There is plenty of fish in the sea
 *
 * @Author XM  2023/05/25
 * Description:
 **/
public class Step06 {
    public static void main(String[] args) {
        //1.找到最长爱好的耗时并输出使用max函数p ;
        List<Man> list2 = new ArrayList<>();
        Man man = Man.builder().build();
        Man man1 = Man.builder().build();
        list2.add(man);
        list2.add(man1);
        Optional<Integer> max = list2.stream().flatMap(manEle -> manEle.getHobbies().stream())
                .map(hoppy -> hoppy.getHours())
                .max(Comparator.comparingInt(e -> e));
                // 或者 .max((e1,e2)->e1-e2);
        System.out.println(max.get());
        //2.统计数量 count函数
        long count = list2.stream().count();
        System.out.println(count);
        //3.将数据转其他类型collect函数
        list2.stream().collect(Collectors.toList());
        list2.stream().collect(Collectors.toSet());
        list2.stream().collect(Collectors.toMap(e->e.getName(),e->e));
        //4.匹配anyMatch 是否存在年龄等于1的 存在就true
        //allMatch必须全部年龄等于1 则true
        //noneMatch都不等于1 则true
        boolean b = list2.stream().anyMatch(e -> e.getAge() == 1);
        //5.随机获取其中一个元素 findAny  获取第一个findFirst
        Man man2 = list2.stream().findAny().get();
    }

}
