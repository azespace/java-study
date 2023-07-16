package com.xmspace.javastudy.thread.completablefuture;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//使用异步对象CompletableFuture异步编程
public class AsynThread03 {
    //创建一个公用的线程池
    public static ExecutorService executorService = Executors.newFixedThreadPool(10);
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("当前线程Id:" + Thread.currentThread().getId());
            int i = 0;
            return i;
        }, executorService).whenComplete((result,exception)->{//whenComplete可以感知异常,并输出结果数据和异常内容
            System.out.println("异步任务完成了！结果是"+result+"异常是："+exception);
        }).exceptionally(throwable -> {//如果出现异常可以对返回的异常内容修改
            return 12345;
        });//使用自己的线程池不用使用默认的，有返回值，并输出结果和出现的异常
    }
}
