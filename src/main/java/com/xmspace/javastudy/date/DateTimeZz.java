package com.xmspace.javastudy.date;

import java.sql.Time;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * @description:
 * @author: 小明长高高
 * @date: 2023/7/10 22:02
 **/
public class DateTimeZz {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.getHour());//获取当前时间的小时位
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getSecond());
        System.out.println(localDateTime.getDayOfMonth());//获取这个月过去几天了
        System.out.println(localDateTime.getDayOfWeek());//获取今天星期几
        System.out.println(localDateTime.getDayOfYear());//获取今年过去几天了
        System.out.println(localDateTime.withYear(2024));//修改当前日期的年份
        System.out.println(localDateTime.plusYears(1));//给当前日期增加一年
        Duration duration = Duration.ofDays(1);
        System.out.println(localDateTime.plus(duration));//给当前日期增加某个时间间隔
        System.out.println(localDateTime);
        System.out.println(LocalDateTime.parse("2007-12-03T10:15:30"));
        System.out.println(Instant.now().toEpochMilli()); //获取毫秒时间戳
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME;//将日期转成预定义格式
        System.out.println(dateTimeFormatter.format(LocalDateTime.now()));
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);//将日期转成本地格式
        System.out.println(dateTimeFormatter1.format(LocalDateTime.now()));
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyyMMdd");//将日期转成自定义格式
        System.out.println(dateTimeFormatter2.format(LocalDateTime.now()));
    }
}
