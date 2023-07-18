package com.xmspace.javastudy.thread.basic;

/**
 * @description: 线程处理器
 * @author: 小明长高高
 * @date: 2023/7/18 23:33
 **/
public class UncaughtExceptionHandlerImpl  {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            throw new RuntimeException("1");
        });
        // 当线程出现了异常 如何处理 可以通过实现Thraed.UncaughtExceptionHandler类的uncaughtException方法
        // 并将处理器设置到线程中完成处理
        thread.setUncaughtExceptionHandler((t, e) -> {
            System.out.println(t.getName());
        });
        thread.start();
    }
}
