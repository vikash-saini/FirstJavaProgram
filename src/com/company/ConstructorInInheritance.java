package com.company;

class Base1{
    public int x;

    Base1(){
        System.out.println("I am Base class a constructor");
    }

//    overloaded constructor
    Base1(int a){
        System.out.println("I am a overloaded constructor with a as: "+a);
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Derived1 extends Base1{
    public int y;

    Derived1(){
//        by default it will call the default constructor of parent class but if we use super() then it will call the oveloaded constructor of parent class
        super(0);
        System.out.println("I am a derived class constructor");
    }
    Derived1(int x){
//        super(0);
        System.out.println("I am a overloaded derived class constructor with x as: "+x);
    }
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I a a childofderived class constructor");
    }
}
public class ConstructorInInheritance {
    public static void main(String[] args) {

//        Base1 b = new Base1();
//        Derived1 d = new Derived1(); // This will call the base1 class constructor first because of inheritance
//        Derived1 d = new Derived1(5);
        ChildOfDerived c = new ChildOfDerived();
    }
}
