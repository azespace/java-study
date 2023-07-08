package com.xmspace.javastudy.clazz;

/**
 * @description:
 * @author: 小明长高高
 * @date: 2023/7/3 23:27
 **/
public interface zzzz extends x,y {
    @Override
    default void s() {
        x.super.s();
    }
}
