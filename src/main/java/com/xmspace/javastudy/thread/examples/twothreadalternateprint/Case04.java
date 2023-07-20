package com.xmspace.javastudy.thread.examples.twothreadalternateprint;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName Case04
 * @Description 线程交替打印
 * @Author XM
 * @Date
 **/
public class Case04 {
    ReentrantLock reentrantLock = new ReentrantLock();
    Condition condition = reentrantLock.newCondition();
    Condition condition1 = reentrantLock.newCondition();
    public void printA() {
        for (int i = 0; i < 10; i++) {
            reentrantLock.lock();
            try {
                System.out.println(Thread.currentThread().getName() + "PrintA");
                //void signal() //重新激活线程 移出等待集 从暂停的地方继续执行
                condition.signal();
                //void await() //当前线程暂停 并让出锁 这与等待获取锁不同，他将被放入等待集合wait Set中，等待其他线程使用signal.All或者signal方法唤醒
                condition1.await();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }finally {
                reentrantLock.unlock();
            }
        }
    }
    public void printB() {
        for (int i = 0; i < 10; i++) {
            reentrantLock.lock();
            try {
                System.out.println(Thread.currentThread().getName() + "PrintB");
                condition1.signal();
                condition.await();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }finally {
                reentrantLock.unlock();
            }
        }
    }
    public static void main(String[] args) {
        Case04 case04 = new Case04();
        new Thread(() -> {
            case04.printA();
        }, "thread01").start();//thread01表示给线程命名方便控制台输出查看
        new Thread(()->{
            case04.printB();
        },"thread02").start();
    }
}
