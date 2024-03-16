package Memory_Management;
class father{
    String name="Bhanupratap";
    void eat(){
        System.out.println(" eating");
    }
    void sleep(){
        System.out.println(" sleeping");
    }
}
class child extends father{
    String name="heera";
    void drink(){
        System.out.println(" drink sprite");
    }
}
public class inheritance {
    // inheritance: parents ki property child me inherit ho jaye.
    // it is used  for the code reusability.
    // extends is the keyword is used to inherit the property of parent to the child.
    // Type of inheritance:
    //1. Single inheritance - 1 parent 1 child
    //2. multilevel -  parent ka child , child ka child. 
public static void main(String[] args) {
    child c = new child();
    c.eat();
    c.sleep();
    System.out.println(c.name); // here overriding is happening.
    father f = new father();
    f.sleep();
    f.eat();
   // f.drink(); error will come because parent class do not call the properties of the child class
   // child class can be empty but parent don't
}
    
}
