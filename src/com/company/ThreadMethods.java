package com.company;

class MyThr3 extends Thread{

    public MyThr3(String name){
        super(name);
    }
    public void run(){
        int i =0;
        while(i<5){
            try{
//                this method will slow down the execution with 3000 miliseconds
                Thread.sleep(3000);
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Thank you "+ this.getName());
            i++;
        }
    }
}
class MyThr4 extends Thread{

    public MyThr4(String name){
        super(name);
    }
    public void run(){
        int i =0;
        while(i<5){

            System.out.println("My Thank you "+ this.getName());

            i++;
        }
    }
}
public class ThreadMethods {
    public static void main(String[] args) {
        MyThr3 t1 = new MyThr3("Vikas");
        MyThr4 t2 = new MyThr4("Dinesh");
        t1.start();
//        here we using try-catch block becoz join() method might throw exception
        try{
            t1.join(); // to ensure t1 get executed before t2 get started we can use join() method
        }catch(Exception e){
            System.out.println(e);
        }

        t2.start();
    }
}
