package Memory_Management;
// import java.util.*;


class animal {
    void eat(){ // parent class
        System.out.println("animal is eating");
    }
}
class dog extends animal{ // extends keyword is used for inheriting the properties and keywords of the parent class 
    void eat(){
        System.out.println("dog is eating");
    }
}


public class overriding {
    // overriding
    //1. Same method
    //2. change in implimentation
    // purana data delete ho jata h aur naya data output me aata h override krke.
    // overriding doesn't achieve directly.
    // it always achieve with the inheritence
   

    // give the error duplicate method
    //    static void eat(){  
    //         System.out.println("animal is eating");
    //     }
 
    //    static void eat(){
    //         System.out.println("dog is eating");
    //     }
    // overriding ko static space me load nhi karate.
    
    //  void eat(){  
    //             System.out.println("animal is eating");
    //         }
     
    //  void eat(){
    //             System.out.println("dog is eating");
    //         }
  
    public static void main(String[] args) {
        dog obj = new dog();
        obj.eat();
    }
}





