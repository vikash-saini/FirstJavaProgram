package com.company;

class Person{
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setAge(int a) {
        this.age = a;
    }


}
class C1{
    public int x =5;
    protected int y = 45;
    int z =6;
    private int a = 70;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);

    }

    void abc(){
        System.out.println("this is default modifier");
    }
}
class C2 extends C1{
    void meth2(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
//        System.out.println(a); -->private modiefier cannot be access within childclass
        abc();
    }


}
public class AccessModifiers {
    public static void main(String[] args) {
        Person prsn = new Person();
//        prsn.name = "vikas";
//        prsn.age = 24; --> Throw an error due to private access modifier
        prsn.setName("Vikas");
        prsn.setAge(24);
        System.out.println(prsn.getName());

        C1 c = new C1();
        c.meth1();
        System.out.println(c.x);
        System.out.println(c.y);
//        System.out.println(c.a); -->a' has private access in 'com.company.C1
        c.abc();


        C2 c2 = new C2();
        c2.meth2();
        c2.abc(); //since it is a default modifier method and using it here in same package , so it is accessible. in different package it not accessible
    }
}
