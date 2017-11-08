package com.ksit.part;

class ScannerTest{
	public static void main(String args[]){
		//创建一个Scanner类的实例
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		System.out.println("How old are you?");
		String age = scanner.next();
		
		//字符串占位符
		System.out.println("Your age is : " + age);
		
		System.out.println("What's your favorite color?");
		//检测到调用scanner对象的next()方法
		//该对象由System.in InputStream 构造
		//所以会先读取控制台下一行输入,然后再打印到控制台
		System.out.println("Your favorite color is : " + scanner.next());

	}
}
