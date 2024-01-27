package com.company;

import java.util.*;
public class HashMapClass {

    public static void main(String[] args) {

//        A map is a data structure that supports the key-value pair mapping for the data.
//        hashset will only contains unique values
        Map<Integer,String> s = new HashMap<>();
           s.put(0,"vikas");
           s.put(1,"Dinesh");
           s.put(2,"Himanshu");
           s.replace(1,"Soyab");
        System.out.println(s);

//       Traversing through the HashMap

        for (Map.Entry<Integer,String> e:s.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());

        }

        Map<Integer,String> hm = new HashMap();
        hm.put(1,"vikas");
        hm.put(2,"Dinesh");
        hm.put(2,"Soyab"); //this will replace perevious value at index 2 i.e "Dinesh",becoz it doen't support duplicate key
        hm.put(4,"Himanshu");

        System.out.println(hm); //out -{1=vikas, 2=Soyab}

        for (Object obj : hm.entrySet()){
            System.out.println(obj);

        }

        Map<String,String> hmd = new HashMap();
        hmd.put("f","vikas");
        hmd.put("ff","Dinesh");

        System.out.println(hmd);

        Map<Integer,String> frnds = new HashMap<>();
        frnds.put(0,"Pintu");
        frnds.put(1,"Rahul");
        frnds.put(2,"Dinesh");
        frnds.put(3,"Maxx");

        System.out.println(frnds);

        for(Object hh:frnds.entrySet()){
            System.out.println(hh);
        };


    }
}
