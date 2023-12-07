package com.xmspace.javastudy.optional.pojo;

import lombok.Builder;
import lombok.Data;

/**
 * There is plenty of fish in the sea
 *
 * @Author XM  2023/05/06
 * Description: 爱好类
 **/
@Data
@Builder
public class Hobby {
    /**
     * 爱好名称
     */
    @Builder.Default
    private String name = "打篮球";
    /**
     * 建议游玩时间
     */
    @Builder.Default
    private Integer hours = 4;
    /**
     * 如何进行，多人 1 单人 0
     */
    @Builder.Default
    private String isMultiplayer = "1";
}
