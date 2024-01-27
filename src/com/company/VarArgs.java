package com.company;

public class VarArgs {

    static int sum(int ...arr){
//        Available as int[] arr;
        int result =0;
        for(int a:arr){
            result +=a;
        }

        return result;
    }

    static  int bar(int a, int ...arr){
//        Atleast One integer is required here
        int result = 0;
        for(int b:arr){
            result +=b;
        }
        return result;
    }
    public static int multiply(int ...arg){
        int result=1;
        for (int c:arg){
            result = result*c;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("welcome to varargs tutorial");
        System.out.println("the sum of Nothing: " + sum());
        System.out.println("the sum of 4 and 5 is: " + sum(4,5));
        System.out.println("The sum of 5 and 6 and 2 is: " + sum(5,6,2));
        System.out.println("The sum of 3 and 6 and 10 is: " + sum(3,6,10));

        System.out.println("The sum of 3 and 4 and 6 is: " + bar(3,4,6));

        System.out.println("The multiplication of 3 and 5 and 6 is: "+multiply(3,5,6));
    }
}
