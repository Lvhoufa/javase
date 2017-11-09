package com.ksit.part;

import java.util.Scanner;

public class commonUtil {

    private static Scanner scanner = new Scanner(System.in);

    public static void SayMessage(String name,String age){
        System.out.println("请输入你的姓名");
        String userName = scanner.next();
        System.out.println("请输入你的年龄");
        String userAge = scanner.next();
        System.out.println("你的姓名是: " + userName + ", 你的年龄是:" + userAge);
    }
}
