package com.company;

import javax.print.Doc;

class EkClass{
    int a;

    EkClass(int a){
        System.out.println("this is Ekclass constructor");
    }
    public int getA(int a){
        return this.a=a;

    }
}

class DoClass extends EkClass{

    int b;

    DoClass(int c){
        super(c);
        System.out.println("this is doclass constructor");
    }

    public int getB(int a){
        return this.b=a;

    }

}
public class ThisSuper {
    public static void main(String[] args) {

        EkClass ek=new EkClass(3);
        System.out.println(ek.getA(6));

        DoClass dk =new DoClass(6);

    }
}
