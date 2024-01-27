package com.company;

import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayVsArrayList {

    public  static void main(String arr[]){

//        intialize Array
        int[] array = new int[2];

//        add element to array, cannot add more than defined size
        array[0]=3;
        array[1]=10;
//        array[2]=30;
//        access an array
        System.out.println("array value at position 1: "+array[1]);
        System.out.println(Arrays.toString(array));
//        initialize an arraylist
        ArrayList<Integer> arrayList= new ArrayList<Integer>();
//        add elements in arrayList, we can add unlimited values
        arrayList.add(15);
        arrayList.add(6);
        arrayList.add(10);
    arrayList.set(2,15);
//        print arraylist value
        System.out.println("value at 2 index"+arrayList.get(2));
        System.out.println(arrayList);

//        remove element from aRRAYlIST
        arrayList.remove(1);
        System.out.println(arrayList);
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.indexOf(10));
        System.out.println("size of arrList: "+arrayList.size());
        System.out.println(arrayList.contains(67));
        arrayList.set(1,55); //Replace the element at given position with given value
        System.out.println(arrayList);
        arrayList.add(2,20);
        System.out.println(arrayList);

        ArrayList<String> cars=new ArrayList<>();
        cars.add("Volvo");
        cars.add("Toyota");
        cars.add("Ferrari");
        cars.add("BMW");

//        looping through for-each
        for (String str : cars){
            System.out.print(str+" ");
        }
        System.out.println("");
        System.out.println(cars.hashCode()); //give hashcode value of list
        List<String> newCars=  cars.stream().filter(obj->{
            if(obj !="Volvo"){
                return true;
            }
            return  false;
        }).collect(Collectors.toList());

        List<String> filtertedCar= cars.stream().filter(obj->obj == "Toyota").collect(Collectors.toList());
        System.out.println(cars);
        System.out.println(newCars);

        List<String> modifiedCars = cars.stream().map(obj->{
            if (obj=="Volvo"){
               int num= cars.indexOf("BMW");
                System.out.println(num);
                cars.set(num,"dd");
            }
            return obj;
        }).collect(Collectors.toList());
        System.out.println(modifiedCars);

        String names="Vikas Dinesh Himanshu";
       String[] nameArray =  names.split(" ");
        System.out.println("ffd"+Arrays.toString(nameArray));

//        covert array into ArrayList or collection
        List<String> covertedList = Arrays.asList(nameArray);
        System.out.println("covertedList"+covertedList);

        List<Student> stu = new ArrayList<>();
        stu.add(new Student(64,"Vikas"));
        stu.add(new Student(65,"Yogesh"));
        stu.add(new Student(63,"Vidhi"));
        stu.add(new Student(12,"Dinesh"));

       for (int i=0;i<stu.size();i++){
//           both below are correct way to get value
//           System.out.println(stu.get(i).Stuname);
           System.out.println(stu.get(i).getStuname());
       }

      
    }
}
