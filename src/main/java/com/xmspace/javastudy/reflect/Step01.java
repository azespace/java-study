package com.xmspace.javastudy.reflect;

import com.xmspace.javastudy.clazz.Clazz;
import com.xmspace.javastudy.clazz.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @description:
 * @author: 小明长高高
 * @date: 2023/7/16 12:11
 **/
public class Step01 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        // 性能最高的反射方式
        Class<Clazz> clazzClass = Clazz.class;
        // 获取对象实例 默认使用无参构造且具有权限
        Clazz clazz = clazzClass.newInstance();
        // 通过有参构造创建实例
        Constructor<Clazz> constructor = clazzClass.getDeclaredConstructor(int.class);
        System.out.println(constructor.getModifiers());
        Clazz clazz1 = constructor.newInstance(11);
        System.out.println(clazz+"-----"+clazz1);
        System.out.println(clazzClass.getDeclaredFields());
    }
}
