package com.xmspace.javastudy.stream4j;

import com.xmspace.javastudy.pojo.Man;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * There is plenty of fish in the sea
 *
 * @Author XM  2023/05/25
 * Description:
 **/
public class Step05 {
    public static void main(String[] args) {
        //1.当需要将一个对象中的集合合并到一起的时候可以使用flatmap
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list.add(4);
        list.add(5);
        list1.add(6);
        list1.add(7);
        lists.add(list);
        lists.add(list1);
        //2.固定类型，所以可以直接使用flatMap的stream方法
        lists.stream().flatMap(Collection::stream).forEach(System.out::println);
        List<Man> list2 = new ArrayList<>();
        Man man = Man.builder().build();
        Man man1 = Man.builder().build();
        list2.add(man);
        list2.add(man1);
        //3.对象类型可以获取需要的数据后转成stream也就变成了List<Hobby>
        list2.stream().flatMap(e->e.getHobbies().stream()).forEach(System.out::println);
        //4.更高级的是可以将List<Hobby>转成List<String>并且爱好名称如果是“打篮球,打乒乓球” 会被分开然后合并
        list2.stream().flatMap(e->e.getHobbies().stream())
                .flatMap(hoppy-> Arrays.stream(hoppy.getName().split(","))).forEach(System.out::println);
    }
}
