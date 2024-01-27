package com.company;

interface sampleInterface{
    void meth1();
    void meth2();
}
/* An interface can be inherit into another interface using 'extends' keyword*/
interface childInterface extends sampleInterface{
    void meth3();
    void meth4();
}
class Mysampleclass implements childInterface{

    @Override
    public void meth1() {

    }

    @Override
    public void meth2() {

    }

    @Override
    public void meth3() {

    }

    @Override
    public void meth4() {

    }
}
public class InheritanceInInterface {
    public static void main(String[] args) {
        Mysampleclass obj = new Mysampleclass();
        obj.meth1();
    }
}
