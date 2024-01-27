package com.company;

import java.util.*;
import java.util.Arrays;

public class LinkedListMethod {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();
        LinkedList<Integer> l2=new LinkedList<>(); // we even can define intialcapacity of an arrayList
        l2.add(15);
        l2.add(18);
        l2.add(20);
//        to insert a values into ArrayList we use add() method
        l1.add(5);
        l1.add(7);
        l1.add(2);
        l1.add(2,6); // we can pass the position with value
        l1.addAll(l2);
        l1.addFirst(45);
        l1.addLast(800);
//        l1.clear(); // rermove all elements from the arrayList
l1.pop(); //remove the element at first position
        int arrLength = l1.size(); // this give the arrayList length
//        System.out.println(arrLength);

        System.out.println(l1.contains(3)); // if given value exist in the array. it gives boolean(true/value) value
        System.out.println(l1.indexOf(7));
        System.out.println(l1.set(3,18)); //Replace the element at given position with given value
        for (int i=0;i<l1.size();i++){
            System.out.print(l1.get(i)); //get() give value at specific position
            System.out.print(',');
        }
        System.out.println("");
        LinkedList<Integer> count1 =new LinkedList<>();
        count1.add(3);
        count1.add(5);
        LinkedList<Integer> count = new LinkedList<>();
        count.add(4);
        count.add(5);
        count.add(1,7);
        count.addAll(0,count1);
        count.addFirst(20);
        count.addLast(30);
        System.out.println("count"+count);
        System.out.println(count.get(4));
        System.out.println(count.pop());// remove the first element of list and return the deleted element
        System.out.println(count);
        Object obj = count.clone(); //return shallow copy of linkedlist as object
        System.out.println(obj);

        Object[] newArr = count.toArray();
        System.out.println(Arrays.toString(newArr));
        List newArr1 = Arrays.asList(newArr);
        System.out.println("newArr1: "+newArr1);

        LinkedList stringlist = new LinkedList();
        stringlist.add("vikas");
        stringlist.add(3);
        stringlist.add(5.6);
        stringlist.push(7); //add element at start

//        stringlist.add(123456789789); doesn't take long integer
        System.out.println(stringlist);

//        traversal
        Iterator itr = stringlist.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next() );
        }

    }
}
