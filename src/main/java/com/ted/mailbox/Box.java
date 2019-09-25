package com.ted.mailbox;

import java.util.Scanner;

public class Box {
    public static void main(String[] args) {
        BoxTester box = new BoxTester();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter object's length:");
        float length = scanner.nextFloat();
        System.out.println("Please enter object's width:");
        float width = scanner.nextFloat();
        System.out.println("Please enter object's height:");
        int height = scanner.nextInt();
        box.validate(length,width,height);
        box.validate1(length,width,height);



    }
}
