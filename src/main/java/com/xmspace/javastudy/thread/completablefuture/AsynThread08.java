package com.xmspace.javastudy.thread.completablefuture;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//使用异步对象CompletableFuture异步编程
public class AsynThread08 {
    //创建一个公用的线程池
    public static ExecutorService executorService = Executors.newFixedThreadPool(10);
    public static void main(String[] args){
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("当前线程Id:" + Thread.currentThread().getId());
            System.out.println("任务1结束");
            int i = 0;
            return i;
        },executorService);
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> {
            System.out.println("当前线程Id:" + Thread.currentThread().getId());
            System.out.println("任务2结束");
            int j = 1;
            return j;
        },executorService);
        future.thenAcceptBothAsync(future1,(result,result1)->{//当任务1和2结束后开始执行任务3，并可以处理任务1和2的结果
            System.out.println("任务3开始执行");
            System.out.println("i+j="+(result+result1));
        },executorService);
    }
}
