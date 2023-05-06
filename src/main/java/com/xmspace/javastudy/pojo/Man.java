package com.xmspace.javastudy.pojo;

import lombok.Builder;
import lombok.Data;

/**
 * There is plenty of fish in the sea
 *
 * @Author XM  2023/05/06
 * Description: 男人类
 **/
@Data
@Builder
public class Man {
    private String name;
    private int age;
    private String[] Hobbies;
}
