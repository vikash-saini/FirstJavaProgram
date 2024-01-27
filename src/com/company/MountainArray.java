package com.company;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,7,4,3,2};

        int peakelementposition= findPeakElementPosition(arr);
        System.out.println(peakelementposition);

//        Que. find target element in the mountain array
        int target =3;
//        step1:find peak element
        int peak = peakelementposition;
//        step2: binary search in ascending part of array which is
//        start=0, end=peak ,(0,peak)
        int firstIndex = searchOrtderAgnosticBinary(arr,target,0,peak);
//        step3:if not found ,binary search in descending part of array,
//        start=peak+1, end=arr.length-1;
        int result;
        if (firstIndex !=-1){
            result =firstIndex;
        }else{
            int secondIndex = searchOrtderAgnosticBinary(arr,target,peak+1, arr.length-1);
            result = secondIndex;
        }
        System.out.println(result);

    }

    static int findPeakElementPosition(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = start+(end-start)/2;

            if (arr[mid]<arr[mid+1]){
//                this means peak element will lies in right part
//                and mid element will not be included since it is already check that it is smaller
                start=mid+1;
            }else{
//                the peak element will lies in the left part to mid
//                mid also can be the answer
                end = mid;
            }
        }
//        int the end, start==end, and pointing to the large number because of above 2 checks
//        start and end always try to find max element in the above 2 checks

        return start; //end also can be returned because both will be same

    }

    static int searchOrtderAgnosticBinary(int[] arr, int target,int start,int end){

        boolean asc =arr[start]<arr[end];

        while(start<=end){
            int mid = start + (end-start)/2;

            if (asc){
                if(arr[mid] <target){
                    start = mid+1;
                }else if(arr[mid] > target){
                    end = mid-1;
                }else if (arr[mid] == target){
                    return mid;
                }
            }else{
                if(arr[mid] <target){
                    end = mid-1;
                }else if(arr[mid] > target){
                    start = mid+1;
                }else if (arr[mid] == target){
                    return mid;
                }
            }

        }

        return -1;
    }
}
