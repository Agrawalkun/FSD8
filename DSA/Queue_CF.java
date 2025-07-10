package DSA;

import java.util.*;

public class Queue_CF { // CF = collection Framework
    public static void main(String[] args) {
        // Queue <Integer> q = new LinkedList<>();  it is space optimize Queue is parent and usind linkedlist which is child class
        // or
        // Queue <Integer> q = new ArrayDeque<>(); it is faster Queue is parent and usind Arraylist which is child class
        Queue <Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            // System.out.println(q.poll());
            System.out.println(q.peek());
            System.out.println(q.remove());
        }

    }
    
}
