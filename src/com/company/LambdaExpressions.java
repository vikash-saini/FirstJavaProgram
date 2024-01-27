package com.company;

interface DemoAnn{
    void math1();
    void math2();
}

@FunctionalInterface
interface DemoAnn1{
    void math1(int a);
}
public class LambdaExpressions {

    public static void main(String[] args) {

//        This is anonymous class, a class which work as class but not a class, it is for single use
        DemoAnn demo = new DemoAnn() {
            @Override
            public void math1() {
                System.out.println("This is demo 1");
            }

            @Override
            public void math2() {
                System.out.println("This is demo 2");
            }
        };

        demo.math1();
        demo.math2();

//      Lambda Expression , functional interface with single abstract method can be used as lambda expression
        DemoAnn1 lambdaExp = (a)->{
            System.out.println("I am Math1 from functional interface "+a);
        };

        lambdaExp.math1(4);

        //        Anonymous class to implement functional interface
        Runnable rn = new Runnable() {
            @Override
            public void run() {
                System.out.println("This is anonymous class");
            }
        };

//        rn.run();
        Thread rnTh = new Thread(rn);
        rnTh.start();
//        using functional interface using lambda
        Runnable rn2 =()->{
            System.out.println("Lambda implementation");
        };

        rn2.run();
    }
}
