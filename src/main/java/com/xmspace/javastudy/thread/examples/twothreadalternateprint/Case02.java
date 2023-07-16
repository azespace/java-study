package com.xmspace.javastudy.thread.examples.twothreadalternateprint;

/**
 * @description: 两个线程交替打印
 * @author: 小明长高高
 * @date: 2023/7/16 18:55
 **/
public class Case02 {
    // 每个线程都打印自己的，但是要一人打印一次来
    public volatile static int i = 1;
    public volatile static int j = 1;
    public volatile static boolean flag = false;
    private static byte[] block = new byte[0];
    public static void main(String[] args) {
        new Thread(() -> {
            while (true) {
                synchronized (block) {
                    if (flag) {
                        try {
                            block.wait();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println(Thread.currentThread().getName()
                                + "----" + (i++));
                        flag = true;
                        block.notify();
                    }
                }
            }
        }).start();
        new Thread(() -> {
            while (true) {
                synchronized (block) {
                    if (!flag) {
                        try {
                            block.wait();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println(Thread.currentThread().getName()
                                + "----" + (j++));
                        flag = false;
                        block.notify();
                    }
                }
            }
        }).start();
    }
}
