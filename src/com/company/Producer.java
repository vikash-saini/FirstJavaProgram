package com.company;

public class Producer extends Thread{
    Organization c;

    Producer(Organization c)
    {
        this.c=c;
    }
    public void run()
    {
        int i=1;
        while(i<=10)
        {
            try {
                this.c.produce_item(i);
            } catch (Exception e) {
                e.printStackTrace();
            }
            try{Thread.sleep(1000);}catch(Exception e){}
            i++;
        }
    }

}
