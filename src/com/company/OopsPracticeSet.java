package com.company;

class Employee{
    String name;
    int salary;

    public int getSalary(){
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n){
        name = n;
    }
}

class Cellphone{
    public void ring(){
        System.out.println("ringing");
    }

    public void vibrate(){
        System.out.println("vibrating");
    }
}

class Square{
    int side;

    public int Area(){
        return side * side;
    }
    public int perimeter(){
        return 4*side;
    }
}
public class OopsPracticeSet {

    public static void main(String[] args) {

//        problem 1
        Employee person = new Employee();
        person.setName("Vikas");
        person.salary = 50;
        System.out.println(person.getName());
        System.out.println(person.getSalary());

//        problem 2
        Cellphone phone = new Cellphone();
        phone.ring();
        phone.vibrate();
//        problem 3
        Square sq = new Square();
        sq.side = 3;
        System.out.println(sq.Area());
        System.out.println(sq.perimeter());
    }
}
