package com.xmspace.javastudy.thread.basic;

/**
 * @description: 钩子线程
 * @author: 小明长高高
 * @date: 2023/7/18 23:54
 **/
public class HookThread {
    public static void main(String[] args) {
        // 通过该方法开启钩子线程 会在JVM退出之前执行 可以做资源释放或者程序是否重复运行的校验
        Runtime.getRuntime().addShutdownHook(new Thread(()->{
            System.out.println(1);
        }));
    }
}
