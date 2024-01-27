package com.company;

class Employee2{
  private String name;
  private int age;

  public void setName(String name){
      this.name=name;
  }

    public String getName(){
      return  this.name;
    }
    public void setAge(int age){
        this.age=age;
    }

    public int getAge(){
       return this.age;
    }


}

class Base2{

    Base2(){
        System.out.println("Base2 constructor");
    }

    public void sayHello(){
        System.out.println("Good morning");
    }
}

public class Encapsulation extends Base2 {
    public static void main(String[] args) {

        Employee2 emp = new Employee2();
        emp.setName("Vikas");
        emp.setAge(25);

        System.out.println(emp.getName());
        System.out.println(emp.getAge());

    }
}
