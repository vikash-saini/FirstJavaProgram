package com.company;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayTut {

    public static void main(String[] args){
        String[] friends = {"vikash","purav","max"};
        System.out.println(friends[2]);
        System.out.println(friends.length);
        Arrays.sort(friends);
        System.out.println(Arrays.toString(friends));
//        foreach loop
        for (String fr:friends) {
            System.out.println(fr);
        }

        Object[] filteredArr = Arrays.stream(friends).filter(obj->obj.equalsIgnoreCase("Vikash")).toArray();
        System.out.println("filteredArr: "+Arrays.toString(filteredArr));

        int[] marks= new int[4];
        System.out.println(Arrays.toString(marks));
//        assign value
        marks[0]=10;
        marks[1]=20;
        marks[2]=40;
        marks[3]=30;

        System.out.println(marks[2]);
        Arrays.sort(marks);
        System.out.println(Arrays.toString(marks));

        int [] mappedMark = Arrays.stream(marks).map(row->row*2).toArray();
        System.out.println("mappedMark: "+Arrays.toString(mappedMark));

        String[] stu= {"vikas","vidhi","dinesh","sneha"};

        System.out.println(Arrays.toString(stu));
//        iteration -1
        for (int i = 0; stu.length >i ; i++) {
            System.out.println(stu[i]);
        }
        System.out.println("iterate with While");
//       iteration -2
        int j=0;
        while (j<stu.length){
            System.out.println(stu[j]);
            j++;
        }
        System.out.println("iterate with Iterator");
//        iteration -3
        Iterator<String> it = Arrays.stream(stu).iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("forloop as obj");
//        iteration -4
        for (String name:stu){
            System.out.println("my name is :"+name);
        }

//        array of Object
        Student_2[] allStu = new Student_2[3];
        allStu[0] = new Student_2("vidhi",25);
        allStu[1] = new Student_2("Sunil",27);
        allStu[2] = new Student_2("Dev",28);

        for (Student_2 a:allStu){
            System.out.println("name:"+a.name+" age:"+a.age);
        }
        System.out.println(allStu[0].name);

//        convert array into array list
        List newArr = Arrays.asList(stu);
        System.out.println(newArr.get(0));

    }
}

class Student_2{
    String name;
    int age;

//    this is constructor, getting called automaticaly when initialize the object.
//    It is called only for once at the time of Object creation
    Student_2(String name,int age){
        this.name =name;
        this.age = age;
    }
}
