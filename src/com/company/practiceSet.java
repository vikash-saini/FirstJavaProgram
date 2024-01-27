package com.company;
import java.util.Scanner;

public class practiceSet {

//   print  multiplication table
    static void multiplication(int n){

        for(int i=1;i<=10;i++){
            System.out.format("%d x %d = %d\n",n,i,n*1);
        }
    }

//    start patter in increment way
    static void pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

//    static void sumRec(int n){
//
//    }

    static void pattern2(int n){
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        Question 1
        float sub1 = 45;
        float sub2 = 56;
        float sub3 = 75;
        float cgpa = (sub1+sub2+sub3)/30;
        System.out.println(cgpa);

//        problem 1
//        multiplication(5);
//        problem 2
//        pattern1(5);
//        problem 4
        pattern2(6);

//        Problem
        int [] arr = new int[3];
        arr[0] =100;
        arr[1]=150;
        arr[2]=200;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int index;
        int i=0;
        while(flag || i<4){
            try{
                System.out.println("Enter valid index");
                index = sc.nextInt();
                System.out.format("the index of arr[index] is "+ arr[index]);
                break;
            }catch(Exception e){
                System.out.println("Invalid index");
            }
            if(i>=4){
                System.out.println("exceed max limit");
                break;
            }
            i++;

        }

        System.out.println("End of programme");
    }

}
