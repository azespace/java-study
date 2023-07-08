package com.xmspace.javastudy.clazz;

/**
 * @description:
 * @author: 小明长高高
 * @date: 2023/7/3 23:15
 **/
public class zzz extends zz implements x{
    // 1.不强制重写，默认保留父类的 可以直接调用
    @Override
    public void s() {
        // 2.重写后，调用super.xxx() 使用父类的
        super.s();
        // 3.重写后，使用父接口的
        x.super.s();
        // 4.完全重写，不调用 super.s();x.super.s(); 直接写自己的逻辑
        // do something....
    }
}
