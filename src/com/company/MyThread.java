package com.company;

import java.math.BigDecimal;

class Thread2 extends Thread{
    public void run() {
        System.out.println("This is my thread2");
        for (int i = 10; i >= 1; i--) {
            System.out.println("value of i is: "+i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){}
        }
    }
}
public class MyThread implements Runnable {

        public void run() {
            System.out.println("hello");
            for (int i = 0; i <= 10; i++) {
                System.out.println("value of i is: "+i);
                try{
                    Thread.sleep(1000);
                }catch (Exception e){}
            }
        }

        public static void main(String[] args) {
            MyThread t1 = new MyThread();
            Thread th = new Thread(t1);
            Thread2 th2 = new Thread2();
            th.start();
            th2.start();

            Thread mainThread= Thread.currentThread();
            System.out.println("name of thread t1 is: "+th.getName());
            System.out.println("This tread is: "+mainThread.getName());

//          change name of thread t1
            th.setName("MyThread");
            System.out.println("name of thread t1 is: "+th.getName());
            System.out.println("Id of thread t1 is: "+th.getId());

            

        }

}
