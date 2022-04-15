package com.company;

import java.util.Scanner;

public class firstzavd {

    public static void main(String[] args) {
	String test1, test2, test3, test4, test5;
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
    System.out.println();
    String test6 = test1.concat(" ").concat(test2).concat(" ").concat(test3).concat(" ").concat(test4).concat(" ").concat(" ").concat(test5).concat(".");
    System.out.println(test6);
    }
}
