package com.xmspace.javastudy.stream4j;

/**
 * There is plenty of fish in the sea
 *
 * @Author XM  2023/05/11
 * Description: Thread的lambda
 **/
public class Step02 {
    public static void main(String[] args) {
        //1.Thread类的启动参数需要传入Runnable函数。而这个函数是函数式接口。可以使用匿名内部类处理。
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(1);
            }
        }).start();
        //2.简化 Runnable接口run方法无参数这里就可以省略 因为只有一个接口方法 所以方法名省略
        new Thread(()->{
            System.out.println(2);
        }).start();

    }
}
