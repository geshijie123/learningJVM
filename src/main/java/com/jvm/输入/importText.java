package com.jvm.输入;

import java.util.Scanner;

public class importText {
    public static void main(String[] args) {
        System.out.print("输入");
        Scanner scan = new Scanner(System.in);
        String read = scan.nextLine();
        System.out.println("输入数据："+read);
        }
}
