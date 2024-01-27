package com.company;

public class TryCatch {
    public static void main(String[] args) {
        int a =6000;
        int b =0;
        try{
            int c  = a/b; // throw an ArithmeticException that is handled by try-catch block
            System.out.println("the result is "+c);
        }catch(Exception e){
            System.out.println(e);
        }

        System.out.println("End of programme");

//      Syntax for Handling Specific type of exception
        /*
        try{
            System.out.println("The value at array index entered is: " );

        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException occured!");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured!");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some other exception occured!");
            System.out.println(e);
        }

         */
    }
}
