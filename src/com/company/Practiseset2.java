package com.company;

abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{

    @Override
    void write() {
        System.out.println("writing");
    }

    @Override
    void refill() {
        System.out.println("refilling");
    }
    void changenib(){
        System.out.println("changing nib");
    }
}
interface TvRemote{
    void changeChannel();
    void volumn(int increment);
}
interface SmartTvRemote extends TvRemote{
    void catchuserVoice();
}
class Tv implements SmartTvRemote{

    @Override
    public void changeChannel() {
        System.out.println("changing channel");
    }

    @Override
    public void volumn(int increment) {
        System.out.println("incresing volumn with " + increment );
    }

    @Override
    public void catchuserVoice() {
        System.out.println("Ok google open youtube");
    }
    void showScreen(){
        System.out.println("showing screen");
    }
}
public class Practiseset2 {
    public static void main(String[] args) {
//        Q1
        FountainPen p = new FountainPen();
        p.changenib();

//        Q2
        Tv t = new Tv();
        t.showScreen();
        t.catchuserVoice();
    }
}
