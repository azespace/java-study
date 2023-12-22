package com.xmspace.javastudy.book.effectivejava.demo01.step05;

import java.util.List;

public class SpellChecker {
    // 手动依赖可以接收任何类型的词典
    private final Lexicon dictionary;

    public SpellChecker(Lexicon dictionary) {
        this.dictionary = dictionary;
    }
    public boolean isValid(String word) {
        // 检查单词是否有效
        return false;
    }

    public List<String> suggestions(String typo) {
        // 提供拼写建议
        return null;
    }
}