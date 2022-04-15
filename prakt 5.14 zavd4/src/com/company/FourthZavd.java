package com.company;

import java.util.Scanner;

public class FourthZavd {

    public static void main(String[] args) {
	String test1,test2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name: ");
        test1 = sc.nextLine();
        System.out.println("Enter the second name: ");
        test2 = sc.nextLine();
        System.out.println();
        if (test1.equalsIgnoreCase(test2)){
            System.out.println("You entered the same names");
        } else {
            System.out.println("The names are different");
        }
    }
}
