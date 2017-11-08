package com.ksit.part;

class AdditionForByteShort{

	public static void main(String args[]){

		byte numberByte = 12;
		short numberShort = 13;
		
		//byte,short类型 做运算会提升为int类型,即便byte的值没有越界,也会变成int类型
		int result = numberByte + numberShort;
		System.out.println(result);
	}
}
