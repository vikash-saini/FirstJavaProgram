package com.company;

import java.util.Scanner;

class InvalidInputException extends Exception{
    @Override
    public String toString() {
        return "invalid inputs";
    }

    @Override
    public String getMessage() {
        return "I am a message";
    }
}

class CannotDividebyzero extends Exception{
    @Override
    public String toString() {
        return "Cannot divide by zero";
    }

}

class CustomCalculator{
    double add(double a, double b) throws InvalidInputException{
        if(a==0 || b==0){
            throw new InvalidInputException();
        }
            return a+b;
    }
    double sub(double a, double b){
            return a-b;
    }
    double multi(double a, double b){
            return a*b;
    }
    double divide(double a, double b) throws CannotDividebyzero{
        if(a==0 || b==0){
            throw new CannotDividebyzero();
        }
        return a/b;
    }
}


public class CustomCalculatorPractice {
    public static void main(String[] args) throws InvalidInputException,CannotDividebyzero{
        /*
        Ex- You have tp create a custom calculator with following operations
        - Addition
        - Subtration
        - Multiplication
        - Division
        Which throw following exceptions:
        invalid input Exception
        Max input exception if any of the input is greater than 10000
        Max Multiplier reached exception - Don't allow any multiplication input to be greater than 7000

         */

        CustomCalculator c = new CustomCalculator();
//        double st=  c.add(0,6);
//            System.out.println(st);
//        try {
//           double st=  c.add(0,6);
//            System.out.println(st);
//        } catch (InvalidInputException e) {
//            System.out.println(e);
//        }

        double dd = c.divide(19,0);
        System.out.println(dd);
    }
}
