package com.ksit.util;

/**
 * 排序工具类
 */
public class SortUtils {

    /**
     * 冒泡排序
     *
     * @param array 待排序数组
     * @return 排序结果
     */
    public static int[] poosort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = 0; j < array.length - 1; j++) {

                if (array[j] < array[j + 1]) {

                    array[j] = array[j + 1] ^ array[j];
                    array[j + 1] = array[j + 1] ^ array[j];
                    array[j] = array[j + 1] ^ array[j];
                }
            }
        }

        return array;
    }
}
