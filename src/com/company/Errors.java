package com.company;

import java.util.Scanner;

public class Errors {
    public static void main(String[] args) {
        int a =5;
//        System.out.println(a + b); --> b is not defined here, it throws syntax error

        // LOGICAL ERROR DEMO
        // Write a program to print all prime numbers between 1 to 10
        System.out.println(2);
        for (int i=1; i<5; i++){
            System.out.println(2*i+1); // output --> 3,5,7,9 // 9 is not a prime number so its logical error
        }

        // RUNTIME ERROR
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt(); //if usder give 0 input it will throw an exception error we can handle the exception using try-catch block

        try{

            System.out.println("Integer part of 1000 divided by k is "+ 1000/k);
        }catch (Exception e){
            System.out.println("inside exception"+ e);
        }
        System.out.println("Hello final");
    }
}
