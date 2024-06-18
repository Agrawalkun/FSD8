package Memory_Management;
class Animal5{
void eat(){
System.out.println("Eating");
}

}
class Dog5 extends Animal5 {
void eat(){
    System.out.println("Eat");
}
}
public class Upcasting_Downcasting {
    public static void main(String[] args) {
        Animal5 d = new Dog5(); // upcasting
        d.eat();
        Animal5 a = (Dog5)new Animal5(); // downcasting // compilation ke time pr error nhi aayega but run time me error aaye to usko late binding khte h.
        // but compilation ke time pr error aaye to usko early binding khte h
        a.eat();
    }

}
