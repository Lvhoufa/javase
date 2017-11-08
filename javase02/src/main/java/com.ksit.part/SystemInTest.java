package com.ksit.part;

class SystemInTest{
	public static void main(String args[]){

		//如果不使用System.in InputStream流 构造Scanner 将无法构造变量
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		scanner.next();

	}
}
