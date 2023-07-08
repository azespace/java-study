package com.xmspace.javastudy.clazz;

import static com.xmspace.javastudy.clazz.Clazz.a;

/**
 * @description:
 * @author: 小明长高高
 * @date: 2023/7/4 21:24
 **/
public class InnerClass {

    public static class InnerStaticClass {
        private static int innerStaticVariable = 30;
        private int innerInstanceVariable = 40;

        public static void staticMethod() {
            System.out.println("This is a static method in InnerStaticClass");
        }

        public void instanceMethod() {
            System.out.println("This is an instance method in InnerStaticClass");
        }
    }

    protected static class E{
        private static int innerStaticVariable = 30;
        private int innerInstanceVariable = 40;

        public static void staticMethod() {
            System.out.println("This is a static method in InnerStaticClass");
        }

        public void instanceMethod() {
            System.out.println("This is an instance method in InnerStaticClass");
        }
    }

    public class A{

    }

    public static void main(String[] args) {
        InnerStaticClass.staticMethod();
    }
}
