package com.xmspace.javastudy.thread.completablefuture;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//使用异步对象CompletableFuture异步编程
public class AsynThread11 {
    //创建一个公用的线程池
    public static ExecutorService executorService = Executors.newFixedThreadPool(10);
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("当前线程Id:" + Thread.currentThread().getId());
            System.out.println("任务1结束");
            int i = 0;
            return i;
        },executorService);
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> {
            System.out.println("当前线程Id:" + Thread.currentThread().getId());
            try {
                Thread.sleep(3000);
                System.out.println("任务2结束");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int j = 1;
            return j;
        },executorService);
        future.acceptEitherAsync(future1, (result) -> {//当任务1和2有一个执行完就执行任务3,感知1和2结果，但无返回值
            System.out.println("任务3开始执行,并获取第一个执行完毕的结果"+result);
        }, executorService);
    }
}
