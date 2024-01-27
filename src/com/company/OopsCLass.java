package com.company;

public class OopsCLass {

    public static void main(String[] args){

        Human nm= new Human();
        nm.name="dinesh";
        nm.age= 25;

        Human nm1= new Human("vikas",24);

        nm1.printDetails();
    }
}

class Human{
    String name;
    int age;

    Human(){
        System.out.println("non-parametrised constructor");
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Human(String name, int age){
        this.name=name;
        this.age=age;
        System.out.println("parametrised constructor");
    }

    public void printDetails(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public void printInfo(String name){
        System.out.println(name);
    }

//    method overloading -polymorphism
    public void printInfo(int age){
        System.out.println(age);
    }
}