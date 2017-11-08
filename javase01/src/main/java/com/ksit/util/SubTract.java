package com.ksit.util;

import java.math.BigDecimal;

class SubTract{
	public static void main(String args[]){
			
		double number1 = 2.0;
		double number2 = 1.1;
		
		//在java中存在减法无限循环情况
		//主要原因在于二进制的问题
		System.out.println(number1-number2);

		BigDecimal bigDecimal = BigDecimal.valueOf(2.0);
		BigDecimal bigDecimal1 = BigDecimal.valueOf(1.1);

        BigDecimal add = bigDecimal.add(bigDecimal1);
        System.out.println(add);
    }
}
