package com.company;

public class RotatedCount {
    public static void main(String[] args) {
        int[] rotatedArr ={4,5,6,7,0,1,2};
        int pivot = findPivot(rotatedArr);
        int rotedcount = pivot+1;
        System.out.println(rotedcount);
    }

    //    for non duplicates
    static int findPivot(int[] arr){
        int start =0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
//            4 cases here
            if (mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if (arr[mid]<=arr[start]){
                end =mid-1;
            }else{
                start =mid+1;
            }
        }

        return -1;

    }
}
