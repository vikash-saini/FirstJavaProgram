package com.company;

//Interface is a group of methods
interface BiCycle{
    int a =45;
    void applyBreak(int decrement);
    void speedUp(int increment);
}
interface Horn{
    void blowHorn();
    void volumn();
}
/* IF implementing an interface in a class then it is necessary to implement the interface methods(ex. applyBreak(),speedUp()) with public.
we can also implements multiple interface in a single Class */
class HeroCycle implements BiCycle,Horn{

    @Override
    public void applyBreak(int decrement) {
        System.out.println("applying break with "+decrement);
    }

    @Override
    public void speedUp(int increment) {
        System.out.println("applying increment with "+ increment);
    }

    @Override
    public void blowHorn() {
        System.out.println("blow horn");
    }

    @Override
    public void volumn() {
        System.out.println("volumn");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        HeroCycle c = new HeroCycle();
        c.applyBreak(5);
//        c.a = 50; // you cannot modify the interface properties as they are final variables
        System.out.println(c.a);
        BiCycle bc = new HeroCycle();
        bc.applyBreak(6);
    }
}
