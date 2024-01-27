package com.company;

class AnotherThread extends Thread{

    @Override
    public void run() {
        super.run();

        for (int i = 10; i >= 0; i--) {
            System.out.println("Another Tread value is:"+ i );
            try{
                Thread.sleep(1000);
            }catch (Exception e){

            }

        }
    }
}

public class MultiTreadExample implements Runnable{

//    Runnable have run() method declare so have to override
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Tread value is:"+ i );
            try{
                Thread.sleep(2000);
            }catch (Exception e){

            }

        }
    }

    public static void main(String[] args) {

        MultiTreadExample myThread= new MultiTreadExample();

//        since we imoplemented Runnanle interface and it doesn't have start() method ,
//        so we should take refrence from Thread class and pass our custom Thread to start it.
        Thread mainTread = new Thread(myThread);
        mainTread.start();

        AnotherThread t2 = new AnotherThread();
        t2.start();
    }
}
