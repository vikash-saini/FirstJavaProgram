package com.company;
import java.util.Stack;
public class StackClass {

    public static void main(String[] args){
//        stack work on Last-In-first-Out / First-in-last-out concept in java
//        There are many real-life examples of a stack. Consider an example of plates stacked over one another in the canteen.
//        The plate which is at the top is the first one to be removed, i.e.
//        the plate which has been placed at the bottommost position remains in the stack for the longest period of time.
//        So, it can be simply seen to follow LIFO(Last In First Out)/FILO(First In Last Out) order.
        Stack<String> cars = new Stack<String>();
        cars.add("Volvo");
        cars.push("Toyota"); //also uses push method to insert element
        cars.push("Suzuki");
        cars.push("Volvo");
        System.out.println(cars);

        cars.addElement("neno");
        System.out.println(cars);


        cars.pop(); // pop will remove last/top inserted element from stack
        System.out.println(cars);
        String abc= cars.get(1);
        System.out.println(abc);
        System.out.println(cars);
        System.out.println("top element of stack: "+cars.peek());

        int c = cars.search("Volvo"); //gives the index of searched value, return -1 if not found
        System.out.println(c);
        System.out.println(cars.empty());

    }
}
