package com.ksit.part;

public class ArrayTest2 {

    public static void main(String[] args) {

        //创建一个长度为3的数组
        double[] doubleNumberArray = new double[3];

        //循环给数组赋值
        for (int i =0;i<doubleNumberArray.length;i++){
            doubleNumberArray[i] = i;
        }

        //循环输出数组
        for (int i =0;i<doubleNumberArray.length;i++){
            System.out.println(doubleNumberArray[i]);
        }



    }
}
