package com.xmspace.javastudy.book.effectivejava.demo01.step07;

import java.util.WeakHashMap;

public class CallbackExample {
    private WeakHashMap<Callback, String> callbacks = new WeakHashMap<>();
    public void registerCallback(Callback callback) {
        callbacks.put(callback, "data");
    }
    public void performAction() {
        // 执行某些操作...
        // 触发回调
        for (Callback callback : callbacks.keySet()) {
            callback.onCallback();
        }
    }
    public static void main(String[] args) {
        CallbackExample example = new CallbackExample();
        // 注册回调
        Callback callback = new Callback() {
            @Override
            public void onCallback() {
                System.out.println("Callback executed");
            }
        };
        example.registerCallback(callback);
        // 执行操作，触发回调
        example.performAction();
        // 将回调置为 null，断开强引用
        callback = null;
        // 执行垃圾回收
        System.gc();
        // 等待一段时间，让垃圾回收器有机会回收不再被引用的对象
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 执行垃圾回收后，回调应该已经被回收
        example.performAction(); // 不会触发回调
    }

    interface Callback {
        void onCallback();
    }
}