package com.ksit.part;

class AutoAttition{

	public static void main(String args[]){
	
		int number1 = 1;
		int number2 = 2;
		
		//先赋值再自增 number3=1,number1=2
		int number3 = number1++;

		//先自增再赋值 number4=3,number1=3
		int number4 = ++number1;
		
		//先赋值再自增 number5=5,number1=4
		int number5 = number1++ + number2;
		
		//先自增再赋值 number6=10,number1=6
		int number6 = ++number1 + number1++;

		System.out.println(number3);
		System.out.println(number4);
		System.out.println(number5);
		System.out.println(number6);
		System.out.println(number1);


	}
}
