package com.company;

import java.util.HashMap;
import java.util.Map;

final class MyInfo{
    private final String name;
    private final int salary;
    private final Map<String,String> metaData;

    public MyInfo(String n1,int s2,Map<String,String> metainfo){
        this.name = n1;
        this.salary= s2;

        Map<String,String> temp = new HashMap<>();
        for (Map.Entry<String,String> entry : metainfo.entrySet())
        {
            temp.put(entry.getKey(),entry.getValue());
        }

        this.metaData = temp;

    }

    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }

    public Map<String,String> getMetaData(){
        Map<String,String> temp = new HashMap<>();

        for (Map.Entry<String,String> entry : metaData.entrySet())
        {
            temp.put(entry.getKey(),entry.getValue());
        }

        return temp;
    }


}

public class ImmutableClass {

    public static void main(String[] args) {

        // Creating Map object with reference to HashMap
        Map<String, String> map = new HashMap<>();

        // Adding elements to Map object
        // using put() method
        map.put("1", "first");
        map.put("2", "second");

        MyInfo my = new MyInfo("ABC", 101,map);

        System.out.println(my.getName());
        System.out.println(my.getSalary());
        System.out.println(my.getMetaData());


    }
}
