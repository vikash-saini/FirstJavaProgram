package com.company;

import java.util.PriorityQueue;

public class PriorityQueueClass {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add("vikas");
        pq.add("Rahul");
        pq.add("Dinesh");
//        pq.add("vikas");
        pq.add("kamlesh");
//        The elements are stored based on the priority order which is ascending by default.
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);

    }
}
