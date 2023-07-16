package com.xmspace.javastudy.thread.completablefuture;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//使用异步对象CompletableFuture异步编程
public class AsynThread12 {
    //创建一个公用的线程池
    public static ExecutorService executorService = Executors.newFixedThreadPool(10);
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> futureImg = CompletableFuture.supplyAsync(() -> {
            System.out.println("当前线程Id:" + Thread.currentThread().getId());
            System.out.println("查询图片信息");
            int i = 0;
            return "1.jpg";
        },executorService);
        CompletableFuture<String> futureValue = CompletableFuture.supplyAsync(() -> {
            System.out.println("当前线程Id:" + Thread.currentThread().getId());
            try {
                Thread.sleep(3000);
                System.out.println("查询商品信息");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "黑色256G";
        },executorService);
        CompletableFuture<String> futureBrand = CompletableFuture.supplyAsync(() -> {
            System.out.println("当前线程Id:" + Thread.currentThread().getId());
            System.out.println("查询商品品牌");
            return "华为";
        },executorService);
        CompletableFuture<Void> future = CompletableFuture.allOf(futureImg, futureValue, futureBrand);
        future.get();//阻塞式方法，等待3个人全部做完再执行后面的
        System.out.println(futureImg.get()+futureValue.get()+futureBrand.get());
    }
}
