package com.xmspace.javastudy.pojo;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * There is plenty of fish in the sea
 *
 * @Author XM  2023/05/06
 * Description: 男人类
 **/
@Data
@Builder
public class Man {
    /**
     * 姓名
     */
    @Builder.Default
    private String name = "小明";
    /**
     * 年龄
     */
    @Builder.Default
    private int age = 18;
    /**
     * 爱好
     */
    @Builder.Default
    private List<Hobby> hobbies = Collections.emptyList();
}
