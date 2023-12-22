package com.xmspace.javastudy.book.effectivejava.demo01.step06;

import java.util.regex.Pattern;

/**
 * There is plenty of fish in the sea
 *
 * @Author XM  2023/12/22
 * Description: 优化后
 **/
public class Pattern02 {
    private static final Pattern ROMAN = Pattern.compile(
            "^(?=.)M*(C[MD]|D?C{0,3})"
                    + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$"
    );

    static boolean isRomanNumber(String s) {
        return ROMAN.matcher(s).matches();

    }
}
