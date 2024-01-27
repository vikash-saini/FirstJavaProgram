package com.company;

import java.util.ArrayList;

class MyGeneric<T1,T2>{
    int val;
    private T1 t1;
    private T2 t2;

    public MyGeneric(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }
}
public class Generics {
    public static void main(String[] args) {
        ArrayList al =  new ArrayList();
        al.add("Vikas");
        al.add(90);
        al.add(34);

//        int a0 = al.get(2); -->Error
        int a = (int) al.get(2);
//        int a1 = (int) al.get(0); // throws runtime error
        System.out.println(a);

        MyGeneric<String,Integer> g1 = new MyGeneric(23,"THis is string","fffd");
        String str = g1.getT1();
        System.out.println(str);
    }
}
