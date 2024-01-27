package com.company;

import java.util.HashMap;

public class DSAQuestions {

    public static void main(String[] args) {
        int[] arr ={12,249,5,3,7845,44,7648,-1235};

//        System.out.println(7845%2);
        int length = (int)(Math.log10(7845)+1);

        System.out.println((length));

        System.out.println(findNumberevendigit(arr));
        int[][] ar={{2,5,1,7,9},{11,25}};
        System.out.println("Max sum: "+findHighestNumber(ar));

        HashMap hasvalue = findMaxNumber(ar);
        System.out.println(hasvalue);
    }

    static int findNumberevendigit(int[] arr){
        int count =0;

        for (int ele:arr) {
//            check if number is negative, convert in positive
            if (ele <0){
                ele = ele*-1;
            }
            int length =  (int)(Math.log10(ele)+1);
//            Note that log100 of any number isn't defined, so if we're expecting any input with value 0 and negative values,
//            then we can put a check for that as well.

            if (length%2 ==0){
                count = count+1;
            }

        }
        return count;

    }

    static int findHighestNumber(int[][] arr){
        int Max =Integer.MIN_VALUE;

        for (int row = 0; row < arr.length; row++) {
            int sum =0;
            for (int col = 0; col < arr[row].length; col++) {
                sum=sum+arr[row][col];
            }

            if (sum>Max){
                Max=sum;
            }
        }

        return Max;

    }

    static HashMap<Integer,Integer> findMaxNumber(int[][] arr){
        int Max =Integer.MIN_VALUE;
        HashMap<Integer,Integer> has = new HashMap<>();

        for (int row = 0; row < arr.length; row++) {
            int sum =0;
            for (int col = 0; col < arr[row].length; col++) {
                sum=sum+arr[row][col];
                has.put(row,sum);
            }

            if (sum>Max){
                Max=sum;
            }
        }

        return has;

    }
}
