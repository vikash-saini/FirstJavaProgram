package com.company;

public class Methods {
   static int logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }else{
            z =(x+y)*5;
        }
        return z;
    }

    static void tellJoke(){
        System.out.println("This is a void method");

    }

    static void changes(int [] arr){
       arr[0]=98;
    }

    static int sum(int ...arr){
        int result =0;
        for(int a:arr){
            result +=a;
        }
        return result;
    }

    public static void main(String[] args) {
        int a =5;
        int b =7;
        int c;
//  Method invocation using object creation
//        Methods obj = new Methods();
//        c = obj.logic(a,b);
        c=logic(a,b);
        System.out.println(c);
        tellJoke();

        int [] marks ={52,44,60};
        changes(marks);
        System.out.println(marks[0]);

        System.out.println("the sum of 4 and 5 is: "+ sum(4,5));
    }
}
