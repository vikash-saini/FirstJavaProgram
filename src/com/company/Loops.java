package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Loops {
    public static void main(String[] args) {
        int i =1;
        while(i <=3){
            System.out.println(i);
            i++;
        }
        System.out.println("finish running while loops");

        int b =0;
        do{
            System.out.println(b);
            b++;
        }while(b<6);
        System.out.println("finish running do-while loops");

        for(int c=0; c<=7;c++){
            System.out.println(c);
        }
        System.out.println("finish running for loops");

      for (int num=0;num<10;num++){

          if (num==3 || num==9){
              continue;
          }
          System.out.println(num);
      }
        int num1=5;
      while (num1 >0){
          if (num1==3 || num1==2){
              num1--;
              continue; //skip this particular condition and continue the loop
          }
          System.out.println(num1);
          num1--;
        }

        List<String> arr = Arrays.asList("Vikas","Dinesh","Vikas","Himanshu","Soyab");

      for (String st:arr){
          if (st=="Himanshu"){
              break; //break the loops
          }
          System.out.println(st);
      }

    }
}
