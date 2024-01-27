package com.company;
import java.io.*;
import java.util.*;

import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {
        int [] marks = new int[5];
        marks[0] = 20;
        marks[1]=30;
        marks[2]=80;
        marks[0]=100;
//        marks[5]=96; throws an error because limit is defined upto 5 elements only
        System.out.println("marks[2] is "+marks[2]);
//        System.out.println(marks[5]);
        int [] abc= {100,40,50,20};
        System.out.println(abc[3]);

        String [] students={"vikas","dinesh","soyab"};
        System.out.println(students[1]);
        System.out.println(students.length);

        for(int i=0;i<students.length;i++){
            System.out.println(students[i]);
        }

        for(String element: students){
            System.out.println("Hi "+element);
        }

        String[] cars={"volvo","toyoto","Tesla"};
        int[] count={1,15,3,4,10,4};
        int[] num={1,2,3,4};
        System.out.println(cars[2]);
        System.out.println(num[2]);
        cars[2]="Baleno";
        System.out.println("changed value at position 2"+cars[2]);

        for (int i=0; i<cars.length;i++){
            System.out.println(cars[i]);
        }

//        foreach loop
        for (String val:cars){
            System.out.println("My car name is: "+val);
        }
//        java.util.Arrays.stream(cars).filter(obj->{
//            System.out.println(obj.toLowerCase());
//            return false;
//        });

//        array of objects
        Student[] stu = new Student[3]; //declare array and define size
        stu[0]= new Student(1,"vikas");
        stu[1]= new Student(2,"naveen");
        stu[2]= new Student(3,"dev");

        for (int i=0; i< stu.length;i++){
            System.out.println("This is : "+stu[i].Stuname);
        }

//       Multidimensional array
        int[][] intArray= { {2,7,9},{3,6,1},{7,4,2} };

        for (int i=0; i< intArray.length;i++){
            for (int j=0;j<intArray[i].length;j++){
                System.out.println("dd: "+intArray[i][j]);
            }
        }

        int intArr[] = { 10, 20, 15, 22, 35 };

        // To print the elements in one line
        System.out.println("Integer Array: "
                + java.util.Arrays.toString(intArr));


        //Array sorting
        for (int i =0;i<intArr.length;i++){

            for (int j =i+1;j<intArr.length;j++){
                if (intArr[i]<intArr[j]){
                    int temp = intArr[i];
                    intArr[i]=intArr[j];
                    intArr[j]=temp;
                }
            }

        }
        System.out.println(java.util.Arrays.toString(intArr));

        int sum=0;
        int i=0;
        while(i<100){
            sum = sum+i;
            sum = i+sum;
            i +=1;

        }
        System.out.println(sum);

//        find elment which appers only once

       List newAr = Arrays.asList("7", "3", "5", "4", "5", "3", "4","8","7","67");
        List modArr = new ArrayList();

        for (int j = 0; j < newAr.size(); j++) {

            int fInd= newAr.indexOf(newAr.get(j));
            int LInd= newAr.lastIndexOf(newAr.get(j));

            if (fInd == LInd){
                System.out.println(newAr.get(j));
                modArr.add(newAr.get(j));
            }
        }

        System.out.println(modArr);

        Map<String,Integer> modArrr2= new HashMap<>();

        for (int j = 0; j < newAr.size(); j++) {
            int n = 0;
            for (int k = 0; k <newAr.size(); k++) {
                if (newAr.get(j)==newAr.get(k)){

                    n +=1;
                }
            }

            modArrr2.put((String) newAr.get(j),n);
        }

        System.out.println(modArrr2);

        Map<String,Integer> modArrr3= new HashMap<>();

//

        //check if Array is sorted or not
        int[] newarr={1, 3, 4, 8, 35 };
        System.out.println(checkArraySorted(newarr));

    }

    static  boolean checkArraySorted(int[] newarr){

        for (int n =0;n<newarr.length;n++) {

            int nn= n+1;
            if(nn< newarr.length){

                if (newarr[n] > newarr[n + 1]) {

                    return false;
                }
            }

        }
        return true;
    }

}

class Student{

    public int rolId;
    public String Stuname;
//    constructor
    Student(int id, String name){
        this.rolId=id;
        this.Stuname = name;

    }

    public String getStuname(){
       return this.Stuname;
    }

    public int getrolId(){
        return this.rolId;
    }

    public void getStuInfo(){
        System.out.println("Hello This is "+ this.Stuname);
        System.out.println("Roll no. "+ this.rolId);
    }
}