package com.company;
import java.util.*;
public class TreeSetClass {
    public static void main(String[] args) {

        //Treeset store objects in ordered manner
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("vikas");
        ts.add("Ajay");
        ts.add("Pintu");
        ts.add("Manish");

        System.out.println(ts);
        Iterator<String> itr = ts.stream().iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
