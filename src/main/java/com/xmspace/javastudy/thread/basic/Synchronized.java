package com.xmspace.javastudy.thread.basic;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName Synchronized
 * @Description synchronized对象锁与类锁
 * @Author XM
 * @Date 2022/09/28 17:15
 **/
public class Synchronized {
    private final Object obj = new Object();
    //  第一种对象锁
    public void printA() {
        synchronized (obj) {
        }
    }
    //    第二种对象锁
    //    this也是属于对象锁,缺点是一旦别人用了这个对象作为锁对象那么会造成死锁，就是说new了Synchronized对象,然后执行了Synchronized.printA(),但是其他线程使用synchronized(Synchronized){},就会导致死锁,下面详细介绍
    public void printB() {
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
            }
        }
    }

    //    第三种对象锁
    public synchronized void printC() {
        //            ...
    }

    //比如在不带关键字static的方法上加锁，或者代码块synchronized(obj){} 里面的对象也不能是static修饰,不然就是类锁，注意，代码块中的对象必须加final，保证该对象不可变
    //不然在执行其他方法的时候对象引用变了就锁不住了。
    //还有一种是属于类锁就是方法带static或者代码块里的private final Object obj = new Object();
    public static void main(String[] args) {
        Synchronized juc003 = new Synchronized();
        Synchronized juc003A = new Synchronized();//用这个就不会锁住了
        //这里测试了printB的this锁,只要其他线程用了这个对象，那么只要用了this的代码块的线程就会陷入锁竞争，因为调用该方法的对象和代码块锁的对象是同一个哈
        new Thread(() -> {
            synchronized (juc003A) {
                try {
                    TimeUnit.SECONDS.sleep(10);
                    System.out.println("1");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
        new Thread(() -> {
            juc003A.printB();
        }).start();
    }
}
