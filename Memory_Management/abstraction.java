package Memory_Management;
abstract class test{
    static void eat(){
        System.out.println("eating"); // 0% abtraction body is vissible
    }
    abstract void sleep(); // 100% abstraction because body is not there abstract method ki bofy nhi hoti h.


}
class demo1{
    void sleep(){
        System.out.println("sleeping"); 
    }
}
class demo2{
    void sleep(){
        
        System.out.println("sleep"); 
    }
}
public class abstraction {
  
    // abstraction: hiding the implimentation
    //1. abstract class
    // 2. interface
    // keyword: abstract
    // abstract class ke andar koi bhi method banate h to usko hmesha by default static ekhna padega.
    public static void main(String[] args) {
        // test n = new test(); // abstract class ka object nhi banega
test.eat(); // direct calling
demo1 sleeping = new demo1();
sleeping.sleep();
demo2 sleep = new demo2();
sleep.sleep();

    }
}
