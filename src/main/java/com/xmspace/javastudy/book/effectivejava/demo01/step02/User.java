package com.xmspace.javastudy.book.effectivejava.demo01.step02;

import cn.hutool.core.lang.Assert;
import cn.hutool.core.util.StrUtil;

/**
 * build模式生成的是不可变类是线程安全的，相对于多参数构造器，更易于阅读和编写
 */
public class User {
    private String name; // 必填字段
    private int age; // 可选字段
    private User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }
    // 在类中创建内部类Build
    public static class Builder {
        private String name;
        private int age;
        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Builder setAge(int age) {
            this.age = age;
            return this;
        }
        public User build() {
            // 必填字段校验
            Assert.isFalse(StrUtil.isNotBlank(name), "name can not be empty");
            // 传入builder对象以构建user对象
            User user = new User(this);
            return user;
        }
    }
}