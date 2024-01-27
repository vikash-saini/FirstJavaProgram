package com.company;

class Base{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a constructor");
    }
}

class Derived extends Base{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(7);
        System.out.println(b.getX());

        Derived d = new Derived();
        d.setX(8);
        System.out.println(d.getX());
        d.setY(44);
        System.out.println(d.getY());
    }
}
