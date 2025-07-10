package DSA;
import java.util.*;
public class StackAL { // AL = ArrayList
   static ArrayList<Integer> list = new ArrayList<>(); // predefined method to constructor ko call krna padta h but in linked list uska constructor wahi banta h to usko call nhi krte
    public static void push(int data){
        list.add(0,data);
    }
    public static int peek(){
       if(list.size() ==0){
return -1;
       }
       return list.get(0);
    }
    public static int pop(){
       if(list.size() ==0){
return -1;
       }
       return list.remove(0); // same work as pop
    }
    public static int size(){
      return list.size();
    }
    public static boolean isEmpty(){
      return (list.size() == 0);
    }
    public static void main(String[] args) {
        StackAL  s = new StackAL();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        while(!s.isEmpty()){
            System.out.println(s.pop());

        }
        
    }
   
}
