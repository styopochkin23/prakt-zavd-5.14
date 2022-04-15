package com.company;

import java.util.Scanner;

public class ThirdZavd {

    public static void main(String[] args) {
	    double test1,test2,test3;
        System.out.println("Enter three fractional numbers");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first word ");
        if (sc.hasNextDouble()){
            test1 = sc.nextDouble();
            System.out.println("Enter second word ");
            test2 = sc.nextDouble();
            System.out.println("Enter third word ");
            test3 = sc.nextDouble();
            System.out.println();
            if (test1 > test2 && test1 > test3){
                System.out.println(test1 + "The largest number");
             else if (test2 > test1 && test2 > test3){
                 System.out.println(test2 + "The largest number");
             else if  (test3 > test1 && test3 > test2){
                 System.out.println(test3 + "The largest number");
             else {
                 System.out.println("There is no largest number");
                        }
             else {
                            System.out.println("You entered no fractional number");
                        }
                    }
                }
            }
        }
    }
}
