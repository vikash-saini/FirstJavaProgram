package com.company;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTut {
    public static void main(String[] args) {
//        String name =  new String("Vikas");
        String name = "VIKAS";
        System.out.print("This name is:");
        name="name changed";
        name.concat("here");
        System.out.print(name);
        System.out.println("");

        StringBuffer s = new StringBuffer("GeeksforGeeks");
        System.out.println("StringBuffer: "+s.toString());
        s.append("world");
        s.insert(13," for ");
        System.out.println("after append: "+s);
        System.out.println(s.length() ==0);


        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name);
        String[] st1 = name.split("");
        System.out.println(Arrays.toString(st1));

        String a= "vikas     ";
        System.out.println("before trim "+a.length());
        System.out.println("after trim "+a.trim().length());

        System.out.println(a.substring(0));// return string from the given index
        System.out.println(a.substring(2,4)); //it will skip the char at 4 index
        System.out.println(a.replace('k','J'));
        System.out.println(a.startsWith("as"));
        System.out.println(a.endsWith("ni"));
        System.out.println(a.charAt(2));
        System.out.println(a.indexOf("sa"));
        System.out.println(a.indexOf('a',3));

        System.out.println(a.equals("Vikas"));
        System.out.println(a.trim().equalsIgnoreCase("VIKAS")); //reture true, egnore the casesentive value
        System.out.println(a.contains("vikas"));
        System.out.println(a.concat(name));

        StringTokenizer st = new StringTokenizer("Geek for Geek");
        System.out.println(st);

        String s1 = "Geeks";
        String s2 = "for";

        int s3 = s1.compareTo(s2);
        System.out.println(s3);

        StringBuffer s4 = new StringBuffer("Geek for Geek");
        System.out.println(s4.delete(5,9));
        System.out.println(s4.reverse());


    }
}
