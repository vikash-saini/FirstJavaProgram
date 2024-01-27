package com.company;
import java.util.Scanner;

public class takingInput {
    public static void main(String[] args) {
        System.out.println("input from user");
        Scanner sc =  new Scanner(System.in);
//        System.out.println("enter number one");
//        int a = sc.nextInt();
//        float a = sc.nextFloat();
//        System.out.println("enter number two");
//        int b = sc.nextInt();
//        float b = sc.nextFloat();
//        int sum = a+ b;
//        float sum =  a+ b;
        String str = sc.nextLine();
//        System.out.println("The sum of these number is");
        System.out.println(str);

//        boolean b = sc.hasNextInt();
//        System.out.println(b);
//        System.out.println("enter long string");
//        String str2= sc.next();
//        System.out.println(str2);

        String name = sc.next();
        System.out.println(name);

    }
}
