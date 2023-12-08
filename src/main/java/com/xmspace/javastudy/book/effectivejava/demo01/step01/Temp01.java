package com.xmspace.javastudy.book.effectivejava.demo01.step01;

import java.util.Collections;
import java.util.EnumSet;
import java.util.List;

/**
 * There is plenty of fish in the sea
 *
 * @Author XM  2023/12/07
 * Description: 静态工厂代替构造函数
 **/
public class Temp01 {
    // 1. 有名字 parseBoolean很容易理解含义相对于构造函数来说
    public static Boolean parseBoolean(Boolean s) throws ClassNotFoundException {
        if (s){
            // 2. Boolean静态工厂不必每次调用时都创建一个新对象 返回单例不可变类的对象 性能up
            return Boolean.TRUE;
        }
        // 3. Collections静态工厂返回的对象类型可以是实际返回类型的子类型，当让你也可以使用 泛型T等 更加灵活
        List<String> lists = Collections.emptyList();
        // 4. EnumSet静态工厂可以根据参数的属性不同从而返回不同的子类型  更加灵活
        EnumSet.noneOf(Topping.class);
        // 5. Class静态工厂获取类时该类可以不存在 提前写好代码规范只是后续编译加入该类 从而实现客户端解耦
        Class.forName("com.mysql.jdbc.Driver");
        return Boolean.FALSE;
    }

    public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}
}
