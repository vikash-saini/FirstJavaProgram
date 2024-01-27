package com.company;

class MyThr extends Thread{
    String name;
    public MyThr(String name){
        super(name);
        this.name=name;
    }
    public void run(){
        int i =0;
        while(i<10){
            System.out.println("Thank you "+this.name);
            i++;
        }
    }
}
class MyThr1 implements Runnable{

    public void run(){
        int i =0;
        while(i<4){
            System.out.println("I am Runnable Thread");
            i++;
        }
    }
}
public class ThreadConstructor {
    public static void main(String[] args) {
        MyThr t = new MyThr("Vikas");
        MyThr t2 = new MyThr("Vidhi");
        t.start();
        t2.start();
        System.out.println("The id of this Thread is:"+t.getId());
        System.out.println("The id of this Thread is:"+t2.getId());
        System.out.println(t.getName());
        System.out.println(t2.getName());

        MyThr1 t3 = new MyThr1();
        Thread th = new Thread(t3,"Dinesh");
        th.start();
        System.out.println("The id of this Thread is:"+th.getId());
        System.out.println(th.getName());
    }
}
