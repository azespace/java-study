package com.xmspace.javastudy.book.effectivejava.demo01.step03;

import cn.hutool.core.lang.copier.Copier;
import org.springframework.expression.spel.ast.Elvis;

/**
 * There is plenty of fish in the sea
 *
 * @Author XM  2023/12/22
 * Description:
 **/
public class Singleton01 {
        // 想获取实例，只能通过Singleton01.INSTANCE来获取
        public static final Singleton01 INSTANCE= new Singleton01();
        // 私有化了，但是无法防止反射获取 你也可以在构造器中抛出异常
        private Singleton01(){
            // 防止反射获取
            if(INSTANCE!=null){
                throw new RuntimeException("单例模式不允许多个实例");
            }
        }
}
