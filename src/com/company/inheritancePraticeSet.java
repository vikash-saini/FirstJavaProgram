package com.company;

class Circle{
    public int radius;

    Circle(int r){
        this.radius =r;
    }
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double CircleAreas(){
        return Math.PI*this.radius*this.radius;
    }

}

class Cylinder extends Circle{
    public int height;

    Cylinder(int r,int h){
        super(r);
        this.height = h;
    }
    public double CylinderArea(){
        return 2*Math.PI*this.radius*this.height + 2*(this.CircleAreas());
    }
    public double Volumne(){
        return Math.PI*this.radius*this.radius*this.height;
    }

}
public class inheritancePraticeSet {
    public static void main(String[] args) {
    Cylinder cy = new Cylinder(4,5);
//    cy.setRadius(4);
    double surfaceArea = cy.CylinderArea();
        System.out.println(surfaceArea);
    }
}
