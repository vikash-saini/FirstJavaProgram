package com.company;
import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        int age =10;
        if(age>18){
            System.out.println("Yes boy u can drive");
        }else if(age==18){
            System.out.println("Yes boy you can drive");
        }else{
            System.out.println("No boy, u can't drive");
        }

        int givenAge ;
        System.out.println("Enter you age");
        Scanner sc = new Scanner(System.in);
        givenAge = sc.nextInt();

        if(givenAge>25){
            System.out.println("You are experienced");
        }else if(givenAge >20){
            System.out.println("you are semi-experienced");
        }else{
            System.out.println("You are not experienced");
        }

        String var = "Himanshu";

        switch(var){
            case "Vikas":
                System.out.println("YOu are a smart boy");
                break;
            case "Shubham":
                System.out.println("you are a good dancer");
                break;
            case "dinesh":
                System.out.println("a comedy boy");
                break;
            default:
                System.out.println("All are intellligent");
        }
    }
}
