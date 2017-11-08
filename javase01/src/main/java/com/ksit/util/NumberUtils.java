package com.ksit.util;

import java.math.BigDecimal;

/**
 * 提供对数字进行操作的工具类
 *
 * @author Panda
 */
public class NumberUtils {

    /**
     * 两个double数字相减
     * 解决基本数据类型损失精度的问题
     *
     * @return 相减的结果
     */
    public static double doubleSubtract(Double minuend, Double subtrahend) {

        //使用BigDecimal类可以解决精度损失问题
        //使用一个String构造一个BigDecimal
        BigDecimal minuendBigDecimal = new BigDecimal(Double.toString(minuend));
        BigDecimal subtrahendBigDecimal = new BigDecimal(Double.toString(subtrahend));

        return minuendBigDecimal.subtract(subtrahendBigDecimal).doubleValue();
    }


    /**
     * 把传进来的数字转换为指定进制
     * @param cale      指定进制
     * @param number    待转换的数字
     * @return          转换结果
     */
    public static int scaleConvert(int cale,int number){
        if (cale == 0){
            throw new RuntimeException("不能转换0进制");
        }

        //如果传进来一个1,要求二进制,1%2=1

        return 0;
    }

}
