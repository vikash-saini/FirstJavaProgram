package com.company;

class Shape{

    public String color;
    public void area(){
        System.out.println("this is shape class");
    }

}

//single level inheritanlce
class Triangle extends Shape{

    public String width;
//    method overriding
    public void area(){
        System.out.println("this is triangle class");
    }
}

//multilevel level inheritanlce
class Rectangle extends Triangle{

    //    method overriding
    public void area(){
        System.out.println("this is Rectangle class");
    }
}

//Heirarchy level inheritanlce
class Cylinder_r extends Shape{

    //    method overriding
//    public void area(){
//        System.out.println("this is Rectangle class");
//    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.area();

        Shape t1= new Triangle();
        t1.area();
        t.color ="red";

        Rectangle t2 =new Rectangle();
        t2.area();

        Cylinder_r t3 = new Cylinder_r();
        t3.area();

    }
}
