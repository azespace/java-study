package com.xmspace.javastudy.basic;

import com.xmspace.javastudy.pojo.Man;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @description:
 * @author: 小明长高高
 * @date: 2023/5/25 19:11
 **/
public class Arr {
    public static void main(String[] args) {
        //1.定义数组
        int[] arr = new int[]{1,3,2};
        int[] arr1 = new int[8];
        Integer[] arr2 = new Integer[1];
        double[] arr3 = new double[]{1,2,3};
        Man[] arr4 = new Man[2];
        Man[] arr9 = new Man[3];
        Man build = Man.builder().build();
        Man build1 = Man.builder().build();
        arr4[0] = build;
        arr4[1] = build1;
        //2.定义二维数组
        int[][] arr5 = new int[4][4];
        //3.遍历二维数组
        for (int i = 0; i < arr5.length; i++) {
            for (int i1 = 0; i1 < arr5[i].length; i1++) {
                System.out.println(arr5[i][i1]);
            }
        }
        //4.Arrays工具类的toString方法
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr4));
        //5.Arrays工具类的sort方法
        Arrays.sort(arr,0,1);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr4);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr4, Comparator.comparingInt(Man::getAge));
        //6.二分查找
        System.out.println(Arrays.binarySearch(arr, 1));
        //7.数组的复制
        int[] ints = Arrays.copyOf(arr, 3);
        System.out.println(Arrays.toString(ints));
        Man[] mans = Arrays.copyOf(arr4, 1);
        System.out.println(Arrays.toString(mans));
        int[] ints1 = Arrays.copyOfRange(arr, 1, 2);
        System.out.println(Arrays.toString(ints1));
        //8.比较2个数组是否相等
        System.out.println(Arrays.equals(arr,arr1));
        System.out.println(Arrays.equals(arr4,arr4));
        //9.填充数组
        Arrays.fill(arr1,1);
        System.out.println(Arrays.toString(arr1));
        Arrays.fill(arr1,2,3,5);
        System.out.println(Arrays.toString(arr1));
        Arrays.fill(arr9,Man.builder().build());
        System.out.println(Arrays.toString(arr9));
        Arrays.fill(arr9,0,1,Man.builder().build());
        System.out.println(Arrays.toString(arr9));
    }
}
