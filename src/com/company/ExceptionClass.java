package com.company;

import java.util.Scanner;

/*We can create custom exceptions by extending built-in class Exception from Java  */
class MyException extends Exception{

    public String toString(){
        return "I am toString";
    }

    @Override
    public String getMessage(){
        return "I am getMessage";
    }

}
public class ExceptionClass {
    public static void main(String[] args) {
        int a ;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a<9){
            try{
                throw new MyException();
            }catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
            }
        }
    }
}
