package com.company;

import java.util.Arrays;

public class LinearSearch {

    public static void main(String[] args) {

        int[] arr ={18,24,30,33,20,49,2,15};
        int target =33;

        int indexAt = search(arr,target);
        System.out.println(indexAt);

//        string search
        String name ="vikas";
        char tch = 'o';

        int ans = searchinString(name,tch);
        System.out.println(ans);

        System.out.println(searchinString2(name,tch));

//        in range
        System.out.println(searchInrange(arr,target,1,3));

        System.out.println(searchminimum(arr));
        System.out.println(searchmaximum(arr));

        int[][] ar={{2,5,1,7,9},{11,25,89,27,45}};
        int tar = 89;
        System.out.println(Arrays.toString(searchIn2D(ar,tar)));
        System.out.println("max value: "+searchMaxIn2D(ar));
    }

    static int search(int[] arr,int target){

        if (arr.length ==0){
            return -1;
        }

        for (int index=0;index<arr.length;index++){

            if (arr[index]==target){
                return index;
            }
        }

        return  -1;
    }

    static int searchinString(String name,char target){

        if (name.length() ==0){
            return -1;
        }

        for (int index=0;index<name.length();index++){

            if (name.charAt(index)==target){
                return index;
            }
        }

        return  -1;
    }

    static boolean searchinString2(String name,char target){

        if (name.length() ==0){
            return false;
        }

        for (char ch:name.toCharArray()) {

            if (ch==target){
                return true;
            }

        }

        return  false;
    }

//    search in given range
    static int searchInrange(int[] arr,int target,int start,int end){

        if (arr.length ==0){
            return -1;
        }

        for (int index=start;index<=end;index++){

            if (arr[index]==target){
                return index;
            }
        }

        return  -1;
    }

//    find minimum integer in an array
    static int searchminimum(int[] arr){

        int ans =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<ans){
                ans = arr[i];
            }

        }

        return ans;
    }

    //    find minimum integer in an array
    static int searchmaximum(int[] arr){

        int ans =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>ans){
                ans = arr[i];
            }

        }

        return ans;
    }

//    search in 2D array
    static int[] searchIn2D(int[][] arr,int target){

        if (arr.length ==0){
            return new int[] {-1};
        }

        for (int row=0;row<arr.length;row++){

            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]==target){
                    return new int[] {row,col};
                }
            }
        }

        return  new int[] {-1};
    }

//    minimumn value in 2D array

    static int searchMaxIn2D(int[][] arr){
        int max = Integer.MIN_VALUE;

        for (int[] row:arr) {
            for (int ele:row) {
                if (ele > max){
                    max=ele;
                }

            }

        }
        return max;
    }

}
