package com.company;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr ={1,3,2,5,4};
       bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubblesort(int[] arr){

        for (int i =0;i< arr.length;i++){

            for (int j = 1; j < arr.length-i; j++) {

                if (arr[j]<arr[j-1]){
//                    swap elements
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }

//        return arr;

    }
}
