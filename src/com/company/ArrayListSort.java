package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayListSort {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5); // we even can define intialcapacity of an arrayList

        l2.add(23);
        l2.add(12);
        l2.add(34);
        l2.add(12);
        l2.add(34);
        System.out.println("array L2: "+l2);
//        to insert a values into ArrayList we use add() method
        l1.add(5);
        l1.add(7);
        l1.add(2);
        l1.add(2,6); // we can pass the position with value
        l1.addAll(l2); //to combine two arraylist
//
        System.out.println("l1 with addAll: "+l1);

//        Method 1
//        List l3 = l1.stream().sorted().collect(Collectors.toList());
//        System.out.println(l3);
//        Method 2:
//        Collections.sort(l1);
//        System.out.println(l1);
        l1.sort((a,b)->b.compareTo(a));
        System.out.println(l1);

//        for (int a : l1){
//            System.out.println(a);
//        }
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }


    }


}
