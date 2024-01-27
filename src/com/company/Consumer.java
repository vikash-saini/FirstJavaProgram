package com.company;

public class Consumer extends Thread{

    Organization c;

    Consumer(Organization c)
    {
        this.c=c;
    }

    public void run(){
        while(true)
        {
            try {
                this.c.consume_item();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try{Thread.sleep(2000);}catch(Exception e){}
        }
    }
}
