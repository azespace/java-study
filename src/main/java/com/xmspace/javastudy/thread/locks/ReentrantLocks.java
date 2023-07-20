package com.xmspace.javastudy.thread.locks;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description: 可重入公平锁
 * @author: 小明长高高
 * @date: 2023/7/20 19:28
 **/
public class ReentrantLocks {
    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        // 可以造出很多个Condition条件对象 用于控制线程的暂停或者开始  需要注意锁只有一把
        Condition condition = reentrantLock.newCondition();
    }
}
