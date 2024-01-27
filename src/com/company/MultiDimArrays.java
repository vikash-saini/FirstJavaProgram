package com.company;

public class MultiDimArrays {
    public static void main(String[] args) {
        int [] marks ; // 1-D array
        int [][] flats; // 2-D array
        flats=new int [2][3];
        flats[0][0]=20;
        flats[0][1]=40;
        flats[0][2]=45;
        flats[1][0]=55;
        flats[1][1]=18;
        flats[1][2]=60;

        System.out.println(flats[1][2]);
    }
}
