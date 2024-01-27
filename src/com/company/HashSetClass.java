package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {
    public static void main(String[] args) {

//      hashset will only contains unique values
        HashSet<Integer> s = new HashSet<>();
        s.add(6);
        s.add(8);
        s.add(23);
        s.add(45);
        s.add(14);
        s.add(8);//it won't take duplicate values
//        System.out.println(s.);
        s.remove(45);
        System.out.println(s);

        ArrayList arr= new ArrayList();
        arr.add(10);
        arr.add(12);
        arr.add(10);
        s.addAll(arr);
        System.out.println(s);
        Iterator its = s.iterator();
        while (its.hasNext()){
            System.out.println(its.next());
        }

    }
}
