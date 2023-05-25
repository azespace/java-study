package com.xmspace.javastudy.functional;

import com.xmspace.javastudy.pojo.Hobby;

import java.util.List;

/**
 * There is plenty of fish in the sea
 *
 * @Author XM  2023/05/06
 * Description: 只有一个方法表示是函数式接口 增加注解FunctionalInterface突出显示
 **/
@FunctionalInterface
public interface HobbiesFuc {
    List hobbiesLists(Hobby a,Hobby b);
}
