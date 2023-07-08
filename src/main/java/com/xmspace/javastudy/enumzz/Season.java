package com.xmspace.javastudy.enumzz;

/**
 * @description:
 * @author: 小明长高高
 * @date: 2023/7/6 22:38
 **/
public enum Season implements Info {
    SPRING("春天", "春暖花开") {
        @Override
        public void show() {
            System.out.println("春天在哪里？");
        }

        @Override
        public void doing() {

        }
    },
    SUMMER("夏天", "夏日炎炎") {
        @Override
        public void show() {
            System.out.println("宁静的夏天");
        }

        @Override
        public void doing() {

        }
    },

    AUTUMN("秋天", "秋高气爽") {
        @Override
        public void show() {
            System.out.println("秋天是用来分手的季节");
        }

        @Override
        public void doing() {

        }
    },
    WINTER("冬天", "白雪皑皑") {
        @Override
        public void show() {
            System.out.println("2002年的第一场雪");
        }

        @Override
        public void doing() {

        }
    };

    //2. 声明每个对象拥有的属性:private final修饰
    private final String SEASON_NAME;
    private final String SEASON_DESC;

    //3. 私有化类的构造器
    Season(String seasonName, String seasonDesc) {
        this.SEASON_NAME = seasonName;
        this.SEASON_DESC = seasonDesc;
    }

    public String getSEASON_NAME() {
        return SEASON_NAME;
    }

    public String getSEASON_DESC() {
        return SEASON_DESC;
    }

    public static void main(String[] args) {
        Season.SPRING.show();
    }
}
