package com.company;

import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayListMethod {
    public static void main(String[] args) {

//        ArrayList can take all type of parameter ex-integer,string etc
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>(5); // we even can define intialcapacity of an arrayList
        l2.add(23);
        l2.add(23);
        l2.add(12);
        l2.add(34);
        l2.add(12);
        l2.add(34);
        l2.add(50);
        System.out.println("array L2: "+l2);
//        to insert a values into ArrayList we use add() method
        l1.add(5);
        l1.add(7);
        l1.add(2);
        l1.add(2,6); // we can pass the position with value
        l1.addAll(l2); //to combine two arraylist

        System.out.println("l1 with addAll: "+l1);

//        Method 1-sorting arraylist
//        System.out.println("streamsort"+l1.stream().sorted().collect(Collectors.toList()));
//        Method 2
//          Collections.sort(l1);
//        System.out.println("collectionsort"+l1);
//        Method 3
        l1.sort((o1,o2)->o1.compareTo(o2));
        System.out.println(l1);
//        l1.clear(); // rermove all elements from the arrayList

        List<Integer> filterList = l1.stream().filter(obj->obj>12).collect(Collectors.toList());
        System.out.println("filterred list:"+filterList);
        int arrLength = l1.size(); // this give the arrayList length
//        System.out.println(arrLength);

        System.out.println(l1.contains(3)); // if given value exist in the array. it gives boolean(true/value) value
        System.out.println(l1.indexOf(7));
        System.out.println(l1.set(3,45));; //Replace the element at given position with given value
        for (int i=0;i<l1.size();i++){
            System.out.print(l1.get(i)); //get() give value at specific position
            System.out.print(',');
        }

        int[] count={1,15,3,4,10,4};
      Arrays.stream(count).sorted();
//        System.out.println("sorted array L1: "+l1.stream().sorted());
        System.out.println(l1.isEmpty());

//        Operation remove duplicates from arraylist
        List<String> students = Arrays.asList("Vikas","Dinesh","Vikas","Himanshu","Soyab");
        System.out.println(students);

        List<String> stu1= new ArrayList<>();
        for (String str:students){
            if (stu1.indexOf(str)==-1){
                stu1.add(str);
            }
        }
        System.out.println("after duplicates remove "+stu1);

//        string to array conversion
        String name1 = "Purav sde";
        char[] cn = name1.toCharArray();
        System.out.println(Arrays.toString(cn));

        ArrayList nn = new ArrayList();
        nn.add("vikas"); //if no datatype is defined, it can contains all type of data
        nn.add(4);
        nn.add(4.5);
        nn.add("c");
//        nn.add(12345678678);doesn't take long integer

        System.out.println(nn);
        nn.clear(); //return empty array
        System.out.println(nn);

        l1.removeAll(l2); //remove all elements of l2 from l1
        System.out.println(l1);
        l1.removeIf(n->(n<7));
        System.out.println(l1);

        List newArr = new ArrayList();
        newArr.add(0,"vikas");
        newArr.add(1,"dd");
        System.out.println(newArr.get(1));

        List<Filtered> ff= new ArrayList<>();
        ff.add(new Filtered("msbs","accNo"));
        ff.add(new Filtered("name","vikas"));

        System.out.println("ff"+ff.get(0).id);

    }
}

class Filtered{
    String id;
    String value;

    Filtered(String id, String value){
        this.id = id;
        this.value = value;
    }
}