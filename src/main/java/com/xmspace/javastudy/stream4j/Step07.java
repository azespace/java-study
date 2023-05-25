package com.xmspace.javastudy.stream4j;

import java.util.stream.Stream;

/**
 * There is plenty of fish in the sea
 *
 * @Author XM  2023/05/25
 * Description:
 **/
public class Step07 {
    public static void main(String[] args) {
        //1.迭代操作，依次加 2 取前 5个  结果 1 3 5 7 9
        Stream<Integer> limit = Stream.iterate(1, a -> a + 2).limit(5);
        //2.归并操作，只有一个参数，将集合中第一个和第二数相加再去加第三个....依次累加
//        System.out.println(limit.reduce((a, b) -> a + b).get());
        //3.有2个参数，带初始值的累加操作 注意返回值不一样上面的是Optional这个是Integer
//        System.out.println(limit.reduce(100,(a, b) -> a + b));
        //4.有3个参数，其实3个参数第一个是初始值，第二个是累加器，第三个是组合器，第三个如果不是并行流不执行
        System.out.println(limit.parallel().reduce(0, (a, b) -> a + b, (c, d) -> c + d));

    }
}
