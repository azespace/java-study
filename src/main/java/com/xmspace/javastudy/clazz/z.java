package com.xmspace.javastudy.clazz;

/**
 * @description:
 * @author: 小明长高高
 * @date: 2023/7/3 23:11
 **/
public class z implements x,y{
    @Override
    public void s() {
        // 1.实现2个抽象类出现不同时强制重写,接口.super.xx()选择一个如果只实现一个接口 则不强制重写。
        x.super.s();
        //2. 完全重写，就直接实现自己的逻辑不调用x.super.s()了
        //do something....
    }
}
