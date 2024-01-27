package com.company;

abstract class  Parent{
    public void sayHello(){
        System.out.println("Hello world");
    }
    abstract public void greet();
}

class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }

    public void helloWorld(){
        System.out.println("Hello Duniya");
    }
}
// Note: - if you making another Class using an Abstarct class then either you have to override the parent's abstarct method(ex. in Child class) or you declared the child class as Abstarct(ex. Child2)
abstract class Child2 extends Parent{
    public void th(){
        System.out.println("this is child2 class");
    }
}
public class Abstract {
    public static void main(String[] args) {
//        Parent p = new Parent(); // we cannot make an object of a abstract class
        Child c = new Child();
        c.greet();

//        Child2 c2 = new Child2(); // we cannot make an object of a abstract class

        Parent p = new Child();

        p.greet();


    }
}

//          An abstract class must be declared with an abstract keyword.
//        It can have abstract and non-abstract methods.
//        It cannot be instantiated.
//        It can have constructors and static methods also.
//        It can have final methods which will force the subclass not to change the body of the method

