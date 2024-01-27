package com.company;

class Employee1{
    String name;
    int age;
    int salary = 12;

    public void printDetails(){
        System.out.println("My name is Vikas Saini");
        System.out.format("I am %d years old\n",24);
    }

    public int getSalary(){
        return salary;
    }
}
public class CustomClass {

    public static void main(String[] args) {
        Employee1 person = new Employee1(); // Instantiation a new Employee Object

//        setting the attributes
//        person.name ="Vikas Saini";
//        person.age = 24;
//        System.out.println(person.name);
//        System.out.println(person.age);

//        printing details with calling method
        person.printDetails();
        int mySalary = person.getSalary();
        System.out.println(mySalary);
    }
}
