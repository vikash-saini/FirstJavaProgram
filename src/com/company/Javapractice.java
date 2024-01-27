package com.company;

import java.util.Scanner;

public class Javapractice {
    public static void main(String[] args) {
        /*
        int totalmarks = 300;
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter marks for maths");
        double m = sc.nextDouble();
        System.out.println("please enter marks for physics");
        double p = sc.nextDouble();
        System.out.println("please enter marks for chemistry");
        double c = sc.nextDouble();
        double stMarks = m+p+c;
        double pr = (stMarks*100)/totalmarks;
        System.out.println("you got: "+stMarks);
        System.out.println("You percentile: "+pr);


         */
//        add two different datatype
        int a = 50;
        float b = 50.5f;
        float sum = a+b;
        System.out.println(sum);

//        Precedence & Associativity
//        Highest precedence goes to * and / . they are then evaluated on the basis of left to right associativity
        int as =60/5-17*2;
        System.out.println(as);

        int bb = 50;
        bb =60;
        System.out.println(bb);

        String name = "Vikas";
        name="Vivan";
        System.out.println(name);

//        int ab = 50;
//        integer ba=50;
//        if (ab==ba){
//            System.out.println("true");
//        }else{
//            System.out.println("false");
//        }
    }
}
