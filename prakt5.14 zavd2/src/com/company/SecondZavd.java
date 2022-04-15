package com.company;

import java.util.Scanner;

public class SecondZavd {

    public static void main(String[] args) {
	    String test1,test2,test3,test4,test5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first word");
        test1 = sc.nextLine();
        System.out.println("Enter second word");
        test2 = sc.nextLine();
        System.out.println("Enter third word");
        test3 = sc.nextLine();
        System.out.println("Enter fourth word");
        test4 = sc.nextLine();
        System.out.println("Enter fifth word");
        test5 = sc.nextLine();
        System.out.println(test1.substring(0,1));
        System.out.println(test2.substring(0,1));
        System.out.println(test3.substring(0,1));
        System.out.println(test4.substring(0,1));
        System.out.println(test5.substring(0,1));
    }
}
