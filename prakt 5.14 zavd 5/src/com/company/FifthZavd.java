package com.company;

import java.util.Scanner;

public class FifthZavd {

    public static void main(String[] args) {
	String test1,test2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first line: ");
        test1 = sc.nextLine();
        System.out.println("Enter second line: ");
        test2 = sc.nextLine();
        System.out.println();
        if (test1.length() > test2.length()){
            System.out.println("The largest line is: " + test1);
        } else {
            System.out.println("The largest line is: " + test2);
        }
    }
}
