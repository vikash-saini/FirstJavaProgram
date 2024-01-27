package com.company;

public class String_Methods {
    public static void main(String[] args) {
        String name = "Vikas";
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name); // original string won't change

        String name1= "        trimmedVikas      ";
        System.out.println(name1.trim());
        System.out.println(name.substring(2)); // give string start from given index to end
        System.out.println(name.substring(0,3)); //won't include the second index character
        System.out.println(name.replace('k','b')); // replace the character with given character
        System.out.println(name.replace("kas","dhi"));
        System.out.println(name.startsWith("Vi")); // give boolean value
        System.out.println(name.endsWith("df"));
        System.out.println(name.charAt(0)); // give value at given index
        System.out.println(name.indexOf("as"));
        String name2 ="Vikas saini";
        System.out.println(name2.indexOf('s',5));
        System.out.println(name2.lastIndexOf("s"));
        System.out.println(name2.lastIndexOf("as",4));
        System.out.println(name.equals("vikas"));
        System.out.println(name.equalsIgnoreCase("vikas"));

        System.out.println("i am escape sequence \n vikas");
    }
}
