package com.xmspace.javastudy.stream4j;

import com.xmspace.javastudy.functional.HobbiesFuc;
import com.xmspace.javastudy.pojo.Hobby;
import com.xmspace.javastudy.pojo.Man;

import java.util.ArrayList;
import java.util.List;

/**
 * There is plenty of fish in the sea
 *
 * @Author XM  2023/05/06
 * Description: lambda
 **/
public class Step01 {

    static void test01(HobbiesFuc hobbiesFuc) {
        List list = hobbiesFuc.hobbiesLists(Hobby.builder().build(), Hobby.builder().name("打羽毛球").hours(1).isMultiplayer("0").build());
        Man xm = Man.builder().hobbies(list).build();
        System.out.println(xm);
    }

    public static void main(String[] args) {
        test01(new HobbiesFuc() {
            @Override
            public List hobbiesLists(Hobby a, Hobby b) {
                List lists = new ArrayList();
                lists.add(a);
                lists.add(b);
                return lists;
            }
        });
        test01((a, b) -> {
            List lists = new ArrayList();
            lists.add(a);
            lists.add(b);
            return lists;
        });
    }

}
