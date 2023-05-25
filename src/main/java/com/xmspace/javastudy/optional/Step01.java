package com.xmspace.javastudy.optional;

import com.xmspace.javastudy.pojo.Hobby;
import com.xmspace.javastudy.pojo.Man;

import java.util.List;
import java.util.Optional;

/**
 * There is plenty of fish in the sea
 *
 * @Author XM  2023/05/25
 * Description:
 **/
public class Step01 {
    public static void main(String[] args) {
        Man man = Man.builder().build();
        //1. of 里面必须传非Null值
        Optional<Man> o = Optional.of(man);
        //2. 创建一个空的Optional
        Optional<Object> empty = Optional.empty();
        //3. 建议使用这种方式传入数据，可以为null
        Optional<Man> man1 = Optional.ofNullable(man);
        //4. 建议使用orElseGet获取数据而不是get，get可能会空指针，orElseGet可以再为null的时候去指定执行哪些方法
        man1.orElseGet(()->Man.builder().build());
        //5. 这个其实和orElseGet差不多，只是抛异常，也建议使用
        man1.orElseThrow(()->new RuntimeException("sa"));
        //6. Optional支持过滤 如果被全部过滤 就是null了
        Optional<Man> man2 = man1.filter(e -> e.getName() == "xxa");
        //7. 建议使用ifPresent而不是isPresent参数中是一个Consumer，如果存在sa则输出
        man1.ifPresent(sa-> System.out.println(sa.getAge()));
        if (man1.isPresent()){
            Man man3 = man1.get();
        }
        //8. map转换可以把里面的数据单例拿出来转成另一个Optional 建议使用
        Optional<List<Hobby>> hobbies = man1.map(e -> e.getHobbies());
        hobbies.ifPresent(e-> System.out.println(e));

    }
}
