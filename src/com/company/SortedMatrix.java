package com.company;

public class SortedMatrix {
    public static void main(String[] args) {

    }

    static int[] search(int[][] matrix,int target){
        int rows = matrix.length;
        int cols = matrix[0].length; //be cautious, matrix may be empty
        
        if(rows==1){
            return binarySearch(matrix,0,target,0,cols-1);
        }

        int rStart=0;
        int rEnd=rows-1;
        int cMid = cols/2;


        while(rStart < (rEnd-1)){
            int mid = rStart + (rEnd-rStart)/2;

            if (matrix[mid][cMid] == target){
                return new int[]{mid,cMid};
            }
            if(matrix[mid][cMid] <target){
                rStart = mid;
            }else if(matrix[mid][cMid] > target){
                rEnd = mid;
            } 
        }

//        now have 2 rows
//        check the target is in the col of 2 rows
        if (matrix[rStart][cMid] == target){
            return new int[]{rStart,cMid};
        }
        if (matrix[rStart+1][cMid] == target){
            return new int[]{rStart+1,cMid};
        }

        return new int[]{-1,-1};
    }

//    search in the row provided b/w the column provided
    static int[] binarySearch(int[][] matrix, int row,int target,int cStart,int cEnd){

        while(cStart<=cEnd){
            int mid = cStart + (cEnd-cStart)/2;

            if(matrix[row][mid] <target){
                cStart = mid+1;
            }else if(matrix[row][mid] > target){
                cEnd = mid-1;
            }else if (matrix[row][mid] == target){
                return new int[]{row,mid};
            }
        }

        return new int[]{-1,-1};
    }
}
