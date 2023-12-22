package com.xmspace.javastudy.book.effectivejava.demo01.step03;

import java.io.Serializable;

/**
 * There is plenty of fish in the sea
 *
 * @Author XM  2023/12/22
 * Description:
 **/
public class Singleton02 implements Serializable {
    private static final long serialVersionUID = 1L;
    // 私有只能通过静态工厂方法获取， 这样的好处是可以修改返回对象，比如后面不想返回单例了可以修改方法
    private static final Singleton02 INSTANCE= new Singleton02();
    private Singleton02(){
        // 同样可以防止反射攻击抛出异常
    }
    public static Singleton02 getInstance(){
        return INSTANCE;
    }
    // 为了防止序列化攻击保证在反序列化的时候一定是返回单例，不仅仅要实现Serializable接口还要加上这个方法
    private Object readResolve(){
        return INSTANCE;
    }
}
