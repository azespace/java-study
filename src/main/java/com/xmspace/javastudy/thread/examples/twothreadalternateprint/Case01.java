package com.xmspace.javastudy.thread.examples.twothreadalternateprint;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @description: 两个线程交替打印
 * @author: 小明长高高
 * @date: 2023/7/16 18:54
 **/
public class Case01 {
    // 2个线程交替打印输出奇数和偶数，直到100结束
    private static final int MAX_NUM = 100;
    //利用可见性保证线程交替打印，如果一个线程没有执行那么另一个线程永远在while循环中。
    private static final AtomicInteger atomicInteger = new AtomicInteger(0);
    public static void main(String[] args) {
        new Thread(() -> {
            while (atomicInteger.get()<MAX_NUM){
                if (atomicInteger.get()%2==0){
                    System.out.println(Thread.currentThread().getName()+"----"+atomicInteger.get());
                    atomicInteger.incrementAndGet();//将atomicInteger加1并返回加1后的新的值。
                }
            }
        }).start();
        new Thread(() -> {
            while (atomicInteger.get()<MAX_NUM){
                if (atomicInteger.get()%2!=0){
                    System.out.println(Thread.currentThread().getName()+"----"+atomicInteger.get());
                    atomicInteger.incrementAndGet();
                }
            }
        }).start();
    }
}
