package com.company;

interface MyGps{
    void getlocation();
}
interface MyCamera{
    void takeSnap();
}
class MyCellphone2 {
    void callNumber(int phonenumber){
        System.out.println("calling a number..." + phonenumber);
    }
    void pickCall(){
        System.out.println("picking call");
    }
}
class MySmartphone2 extends MyCellphone2 implements MyGps,MyCamera{

    @Override
    public void getlocation() {
        System.out.println("showing location");
    }

    @Override
    public void takeSnap() {
        System.out.println("taking snap");
    }

    public void runBrower(){
        System.out.println("Browsing internet...");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        MyGps g = new MySmartphone2(); // can only access GPS methods
        g.getlocation(); //allowed
//        g.runBrower(); --> throw an error
        MySmartphone2 s = new MySmartphone2(); //can use all the methods
        s.getlocation();
        s.runBrower();
        s.callNumber(5);
    }
}
