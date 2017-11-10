package com.ksit.part;

public class ArrayTest3 {

    public static void main(String[] args) {

        //创建一个长度为3的数组
        String[] stringArray = new String[3];

        //循环给数组赋值
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = "元素" + i;
        }

        //循环输出数组
        /*for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }*/

        String[] stringArray2 = new String[5];
        /*System.out.println(stringArray2.length);
        System.out.println(stringArray2[3]);
        System.out.println(stringArray2[3].hashCode());*/

        stringArray2 = stringArray;

        for (String s:stringArray2
             ) {
            System.out.println(s);
        }

        System.out.println(stringArray2[4]);


    }
}
