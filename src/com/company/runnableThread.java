package com.company;

class MyThreadRunnable1 implements Runnable{

    @Override
    public void run() {
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
        System.out.println("I am a Thread not a threat");
    }
}
class MyThreadRunnable2 implements Runnable{

    @Override
    public void run() {
        System.out.println("I am a Thread 2 not a threat 2");
        System.out.println("I am a Thread 2 not a threat 2");
        System.out.println("I am a Thread 2 not a threat 2");
        System.out.println("I am a Thread 2 not a threat 2");
        System.out.println("I am a Thread 2 not a threat 2");
        System.out.println("I am a Thread 2 not a threat 2");
        System.out.println("I am a Thread 2 not a threat 2");
        System.out.println("I am a Thread 2 not a threat 2");
        System.out.println("I am a Thread 2 not a threat 2");
        System.out.println("I am a Thread 2 not a threat 2");
        System.out.println("I am a Thread 2 not a threat 2");
        System.out.println("I am a Thread 2 not a threat 2");
        System.out.println("I am a Thread 2 not a threat 2");
        System.out.println("I am a Thread 2 not a threat 2");
        System.out.println("I am a Thread 2 not a threat 2");
        System.out.println("I am a Thread 2 not a threat 2");
        System.out.println("I am a Thread 2 not a threat 2");
        System.out.println("I am a Thread 2 not a threat 2");
        System.out.println("I am a Thread 2 not a threat 2");
        System.out.println("I am a Thread 2 not a threat 2");
        System.out.println("I am a Thread 2 not a threat 2");
        System.out.println("I am a Thread 2 not a threat 2");
        System.out.println("I am a Thread 2 not a threat 2");
        System.out.println("I am a Thread 2 not a threat 2");
        System.out.println("I am a Thread 2 not a threat 2");
        System.out.println("I am a Thread 2 not a threat 2");
        System.out.println("I am a Thread 2 not a threat 2");
        System.out.println("I am a Thread 2 not a threat 2");
        System.out.println("I am a Thread 2 not a threat 2");
        System.out.println("I am a Thread 2 not a threat 2");
        System.out.println("I am a Thread 2 not a threat 2");
        System.out.println("I am a Thread 2 not a threat 2");
        System.out.println("I am a Thread 2 not a threat 2");
    }
}
public class runnableThread {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 =new MyThreadRunnable1();
//        bullet1.start(); --> we cannot start the treat while implemneting runnable thread so we have to pass this object into thread;
        Thread gun1 = new Thread(bullet1);

        MyThreadRunnable2 bullet2 =new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

    }
}
