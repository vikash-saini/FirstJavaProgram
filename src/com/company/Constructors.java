package com.company;

class MyEmployee{
    private String name;
    private int age;

//    same class name method will be act as contructor method and it will be called automatically when the object is initialize
    public MyEmployee(){
        name = "Dinesh Saini";
        age = 24;
    }

    public MyEmployee(String myName){
        name = myName;
        age = 24;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setAge(int a) {
        this.age = a;
    }
}

public class Constructors {
    public static void main(String[] args) {

        MyEmployee employee = new MyEmployee("Vikas saini");
        System.out.println(employee.getName());

//        method overloading
        MyEmployee employee2 = new MyEmployee();
        System.out.println(employee2.getName());
    }
}
