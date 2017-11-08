package com.ksit.part;

class StringAdditionNumberTest{

	public static void main(String args[]){
		
		//任何数据类型和String做运算,结果都是字符串
		
		//字符串变量开头,就从左往右拼接字符串
		System.out.println("3 + 7 = " + 3 + 7);

		//数字变量开头就先计算 数字类型表达式 再拼接字符串,结果为Stirng类型
		System.out.println(3 + 7 + "=  3 + 7");

		//乘号可以提高运算符优先级
		System.out.println("3 + 7 = " + 3 * 7);

		//小括号也可以提高运算符优先级
		System.out.println("3 + 7 = " + (3 + 7));


	}
}
