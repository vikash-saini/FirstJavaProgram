package com.company;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeMethod {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque();
        ad1.add(45);
        ad1.add(3);
        ad1.addFirst(30);
        System.out.println(ad1);
        ad1.removeLast();
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
        System.out.println("after removal of last:  "+ad1);


        Iterator<Integer> itr = ad1.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
