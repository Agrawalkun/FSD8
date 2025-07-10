package DSA;
import java.util.*;
public class StackCF { // CF = collection Framework
    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>(); // creating the stack
        s.push(1); // inserting the element
        s.push(2);
        s.push(3);
        System.out.println(s.peek()); // seeing the element
        System.out.println(s.pop()); // seeing and deleting the element
        System.out.println(s.size()); // tell the whole size of the stack
        while(!s.isEmpty()){ // s.size()>0; // print the all element of the stack
             System.out.println(s.pop());
        }

    }
}
