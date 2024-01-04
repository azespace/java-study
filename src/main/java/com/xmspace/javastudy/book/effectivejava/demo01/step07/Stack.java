package com.xmspace.javastudy.book.effectivejava.demo01.step07;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * There is plenty of fish in the sea
 *
 * @Author XM  2024/01/04
 * Description:
 **/
public class Stack {
    private Object[] elements;
    private int size = 0;
    private static int DEFAULT_INITIAL_CAPACITY = 16;
    public Stack() {
    }
    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }
    public Object pop() {
        if (size == 0)
            throw new EmptyStackException();
        Object result = elements[--size];
        // 栈弹出需要将弹出的元素置空，防止内存泄漏
        elements[size] = null; // Eliminate obsolete reference
        return result;
    }
    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }
}
