package com.xmspace.javastudy.book.effectivejava.demo01.step06;

/**
 * There is plenty of fish in the sea
 *
 * @Author XM  2023/12/22
 * Description:
 **/
public class Box01 {
    public static void main(String[] args) {
        sum();
    }
    private static long sum(){
        // long sum = 0L
        Long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        return sum;
    }
}
