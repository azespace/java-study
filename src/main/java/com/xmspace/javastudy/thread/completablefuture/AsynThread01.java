package com.xmspace.javastudy.thread.completablefuture;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//使用异步对象CompletableFuture异步编程
public class AsynThread01 {
    //创建一个公用的线程池
    public static ExecutorService executorService = Executors.newFixedThreadPool(10);
    public static void main(String[] args) {
        CompletableFuture.runAsync(()->{
            System.out.println("当前线程Id:"+Thread.currentThread().getId());
        },executorService);//使用自己的线程池不用使用默认的，无返回值
    }
}
