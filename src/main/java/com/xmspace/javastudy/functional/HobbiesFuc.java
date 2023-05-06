package com.xmspace.javastudy.functional;

import com.xmspace.javastudy.pojo.Hobby;

import java.util.List;

/**
 * There is plenty of fish in the sea
 *
 * @Author XM  2023/05/06
 * Description:
 **/
@FunctionalInterface
public interface HobbiesFuc {
    List hobbiesLists(Hobby a,Hobby b);
}
