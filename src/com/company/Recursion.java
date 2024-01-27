package com.company;

//Recursion - A function in java can call itself. such calling of function is called Recursion
public class Recursion {
    //    factorial(0)=1;
//        factorial(n)=n*n-1*n-2*....*1;
//        factorial(5) = 5*4*3*2*1;
//        factorial(n) = n*factorial(n-1);
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }else{
            return n*factorial(n-1); //Recursion
        }

    }

    static int fib(int n){
        if(n==1){
            return 0;
        }else if(n==2){
            return 1;
        }else{
          return  fib(n-1) + fib(n-2);
        }

    }

    public static void main(String[] args) {
        int a =4;
        System.out.println(factorial(a));

//        Fibonacci : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,
//        find fibonacci number of nth , start index from 1
        int res = fib(9);
        System.out.println(res);

    }
}
