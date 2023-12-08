package com.xmspace.javastudy.book.effectivejava.demo01.step02;

import java.util.Objects;

public class NyPizza extends Pizza {
    public enum Size {SMALL, LARGE}
    private final Size size;
    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;
        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }
        @Override
        protected Builder self() {
            return this;
        }
        @Override
        NyPizza build() {
            return new NyPizza(this);
        }
    }
    private NyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }
    public static void main(String[] args) {
        //
        NyPizza calzone = new NyPizza.Builder(Size.SMALL)
                        .addTopping(Topping.ONION).build();
    }
}