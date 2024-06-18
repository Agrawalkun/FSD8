package Memory_Management;
// instance of operator: ye batayega ki object kis class ka h.
class Animal6{
    void eat(){
        System.out.println("Eating");
    }
    void disp(){
        System.out.println("displaying");
    }
}
class Dog6 extends Animal6 {
    void disp(){
        System.out.println("Eat");
    }
}

public class instance_of_operator {
    public static void main(String[] args) {
    Dog6 d = new Dog6(); 
    d.disp();
    d.eat();
    Animal6 a = new Animal6();
    a.disp();
    a.eat();
    System.out.println(a instanceof Animal6);
    }
    
}
