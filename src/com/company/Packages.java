package com.company;

//import java.util.Scanner; --> import only Scanner Class
import java.util.*; // import all Class from util

public class Packages {
    public static void main(String[] args) {
//        java.util.Scanner sc = new Scanner(System.in); //alternate way to import
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is my Scanner");
        int val = scanner.nextInt();
        System.out.println(val);
    }
}
