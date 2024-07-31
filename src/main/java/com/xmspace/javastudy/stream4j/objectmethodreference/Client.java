package com.xmspace.javastudy.stream4j.objectmethodreference;

import java.util.function.BiPredicate;

/**
 * @description: 对象方法引用
 * @author: 小明长高高
 * @date: 2024/7/31 22:09
 **/
public class Client {
    public static void main(String[] args) {
        // 对象方法lambda表达式
        // BiPredicate是函数式接口boolean test(T t, U u); 两个参数，返回boolean,而String::equals也是两个参数，返回boolean 所以可以替换使用！
        // 对象方法引用要求第一个参数是调用对象，第二个参数是方法的参数
        BiPredicate<String, String> bp = (x, y) -> x.equals(y);
        // 对象方法引用 注意和实例方法的区别
        BiPredicate<String, String> bp1 = String::equals;
        boolean test = bp.test("a", "b");
        System.out.println(test);
    }
}
