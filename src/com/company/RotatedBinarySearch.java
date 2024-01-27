package com.company;

public class RotatedBinarySearch {
    public static void main(String[] args) {

//        this is rotated array [num[k],num[k+1],.......num[n-1],num[0],num[1],.....,num[k-1]]
//        original sorted array {0,1,2,4,5,6,7}
        int[] rotatedArr ={4,5,6,7,0,1,2};
        int target=6;
        int findIndex = search(rotatedArr,target);
        System.out.println(findIndex);

//        if array contains duplicates
        int[] rotatedArr1 ={2,2,5,6,7,0,1,2};

        int pivot1 = findPivotFromDuplicates(rotatedArr1);
        System.out.println(pivot1);

    }

    static int search(int[] arr,int target){
        int pivot = findPivot(arr);
        System.out.println(pivot);

//        if you did not find a pivot, means arr is not rotated
        if(pivot ==-1){
            //        just do simple binary search
            return binarySearch(arr,target,0,arr.length-1);
        }

//        if pivot is found,you have found to ascending sorted array
        if(arr[pivot] ==target){
            return pivot;
        }

        if(arr[0]<=target){
            return binarySearch(arr,target,0,pivot-1);
        }

        return binarySearch(arr,target,pivot+1,arr.length-1);

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

    static int binarySearch(int[] arr, int target,int start,int end){

        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid] <target){
                start = mid+1;
            }else if(arr[mid] > target){
                end = mid-1;
            }else if (arr[mid] == target){
                return mid;
            }
        }

        return -1;
    }

    //    for duplicates
    static int findPivotFromDuplicates(int[] arr){
        int start =0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
//            4 cases here
            if (mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if (arr[mid]==arr[start] && arr[mid]==arr[end]){
//                skip the duplicates
//                Note:what if these elements at start and end were the pivot?
//                check is start is pivot
                if (arr[start] > arr[start+1]){
                    return start;
                }
                start++;
                // check is start is pivot
                if (arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            }
//            left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end])){
                start=mid+1;
            }else{
                end=mid-1;
            }

        }
        return -1;
    }
}
