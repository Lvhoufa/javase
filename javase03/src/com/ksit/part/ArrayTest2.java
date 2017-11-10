package com.ksit.part;

public class ArrayTest1 {

    public static void main(String[] args) {
        int[] numbers = {1,2,3};

        //创建指定长度的数组
        int[] numbers2 = new int[3];
        System.out.println(numbers2.length);

        //对数组指定索引位置元素赋值
        numbers2[2] = 9;
        System.out.println(numbers2[1]);
    }
}
