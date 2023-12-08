package com.xmspace.javastudy.book.effectivejava.demo01.step02;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 * 可以协变返回类型的Builder
 */
// 超类中的Build
public abstract class Pizza {
    public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}
    final Set<Topping> toppings;
    abstract static class Builder<T extends Builder<T>> {
        // 使用指定的元素类型创建一个空的枚举集
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
        // 每次添加了属性后然让子类返回自己从而一直Build
        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            // 用于调用父类方法并返回子类的Builder从而一直Builder
            return self();
        }
        // 这2个抽象类是如何和Pizza(Builder<?> builder)配合的呢
        // 1. 子类继承父类的时候会调用父类的构造方法,所以就可以将父类的builder传递到子类
        // 2. 这2个方法属于抽象类逻辑提前定义，用于build链路打通
        // 3. 子类实现 self实现后返回子类的Builder，注意父类的addTopping调用了子类的self方法，链路打通了
        // 3. 子类实现build方法，先执行父类的构造方法，将父类的toppings属性赋值到子类，再执行子类构造方法，将子类的属性赋值到子类，完成build
        protected abstract T self();
        abstract Pizza build();
    }
    Pizza(Builder<?> builder) {
        // 枚举类克隆将所有属性赋值到主类
        toppings = builder.toppings.clone();
    }
}