package com.company;

//Method one:- to implement a Threading we can extend the buit-in class Thread
class MyThread1 extends Thread{
    @Override
    public void run() {
        int i =1;
        while(i<20){
            System.out.println("Thread cooking ");
            i++;
        }

    }
}
class MyThread2 extends Thread{
    @Override
    public void run() {
        int i =1;
        while(i<18){
            System.out.println("Thread2 chatting ");
            i++;
        }

    }
}
public class ExtendingThread {
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start(); // to start a thread we have to execute start method;
        t2.start();
    }
}
