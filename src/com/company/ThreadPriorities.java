package com.company;

class MyThr2 extends Thread{

    public MyThr2(String name){
        super(name);
    }
    public void run(){
        int i =0;
        System.out.println("Thank you " + this.getName());
//        while(i<10){
//            System.out.println("Thank you");
//            i++;
//        }
    }
}
public class ThreadPriorities {
    public static void main(String[] args) {
        MyThr2 t1=new MyThr2("vikas");
        MyThr2 t2=new MyThr2("saini Vikas");
        MyThr2 t3=new MyThr2("Dinesh");
        MyThr2 t4=new MyThr2("Sandeep");
        t1.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(4);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        System.out.println(t2.getPriority());
        System.out.println(Thread.currentThread().getState());

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
//        using funtional interface using lambda
        Runnable rn2 =()->{
            System.out.println("Lambda implementation");
        };

        rn2.run();


    }
}
