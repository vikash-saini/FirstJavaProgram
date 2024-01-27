package com.company;
import java.util.Arrays;
import java.util.Collections;

public class ArraySort {

    public static void main(String args[])
    {
        int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
        System.out.println("The original array is: "+arr.length);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        Arrays.sort(arr);
        System.out.println("\nThe sorted array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("toString: "+Arrays.toString(arr));

        Student[] stu = new Student[3]; //declare array and define size
        stu[0]= new Student(1,"vikas");
        stu[1]= new Student(2,"naveen");
        stu[2]= new Student(3,"dev");


        Integer[] arrr = { 13, 7, 6, 45, 21, 9, 2, 100 };

        // Sorts arr[] in descending order using
        // reverseOrder() method of Collections class
        // in Array.sort() as an argument to it
        Arrays.sort(arrr, Collections.reverseOrder());

        // Printing the array as generated above
        System.out.println("Modified arr[] : "
                + Arrays.toString(arrr));



    }
}

class Student1{

    public int rolId;
    public String Stuname;
    //    constructor
    Student1(int id, String name){
        this.rolId=id;
        this.Stuname = name;

    }
}

