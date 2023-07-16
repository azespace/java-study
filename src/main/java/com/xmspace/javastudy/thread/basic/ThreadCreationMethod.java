package com.xmspace.javastudy.thread.basic;

import java.util.concurrent.*;

/**
 * @description: 线程的4种创建方式
 * @author: 小明长高高
 * @date: 2023/7/16 19:19
 **/
public class ThreadCreationMethod {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Thread01 thread01 = new Thread01();
        thread01.start();

        Runnable02 runnable02 = new Runnable02();
        new Thread(runnable02).start();

        Callable03 callable03 = new Callable03();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(callable03);
        new Thread(futureTask).start();
        System.out.println(futureTask.get());//获取Callable03执行结果

        //创建固定数量的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Callable04 callable04 = new Callable04();
        Future future = executorService.submit(callable04);
        System.out.println(future.get());//获取Callable04返回结果
    }
    public static class Thread01 extends Thread{
        @Override
        public void run() {
            System.out.println("继承Thread实现第一种多线程方式"+"----线程Id:"+Thread.currentThread().getId());
        }
    }
    public static class Runnable02 implements Runnable{
        @Override
        public void run() {
            System.out.println("实现Runnable接口并传入Thread实现第二种多线程方式"+"----线程Id:"+Thread.currentThread().getId());
        }
    }
    public static class Callable03 implements Callable<Integer> {
        @Override
        public Integer call() {
            System.out.println("实现Callable接口并传入FutureTask,再将FutureTask传入Thread实现第三种多线程方式"+"----线程Id:"+Thread.currentThread().getId());
            int i = 0;
            return i;
        }
    }
    public static class Callable04 implements Callable<Integer>{
        @Override
        public Integer call() {
            System.out.println("使用线程池实现第四种多线程方式"+"----线程Id:"+Thread.currentThread().getId());
            int i = 0;
            return i;
        }
    }
}
