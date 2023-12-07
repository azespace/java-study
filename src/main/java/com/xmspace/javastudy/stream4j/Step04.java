package com.xmspace.javastudy.stream4j;

import com.xmspace.javastudy.optional.pojo.Man;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * There is plenty of fish in the sea
 *
 * @Author XM  2023/05/11
 * Description: 流的操作
 **/
public class Step04 {
    public static void main(String[] args) {
        Man xm = Man.builder().build();
        List<Man> list = new ArrayList<>();
        list.add(xm);
        list.add(xm);
        List<Integer> manList = list.stream()
                //1.对象去重使用equals和hashcode比较 已重写过
                .distinct()
                //2.过滤掉一些数据,这里是保留姓名为小明的数据
                .filter(man -> man.getName().equals("小明"))
                //3.流数据计算 流数据转换  这里将List<Man>转成了List<Integer>
                .map(man -> man.getAge())
                //4.转换后再将List<Integer>中的每个年龄都+10
                .map(age->age+10)
                //5.排序 我们可以传入Int类型的比较器,这里比较的就是属性本身所以写法是e->e 是对象的得这么写e -> e.getAge()
                //  默认从小到大排序，想要从大到小可以使用反转函数实现Comparator.comparingInt(e->(int)e).reversed()
                .sorted(Comparator.comparingInt(e->e))
                //6.也可以直接比较 默认从小到大排序 改成从大到小的话只需要交换位置e2-e1 即可
                .sorted((e1,e2)->e1-e2)
                //7.排序后拿出头部2个数据
                .limit(2)
                //8.跳过前N个元素 剩下的留下
                .skip(1)
                //7.terminal operation(终端操作) 把数据转成List
                .collect(Collectors.toList());
                //注意，java的终端操作只可以有一次。所以foreach不可以用。
                //.forEach(age-> System.out.println(age));
        System.out.println(manList);
    }
}
