package Memory_Management;
//WAP to create a class called "Person" with a name and age attribute. create two instance of the "Person" class set their attributes using the constructor and print their name andage
import java.util.*;
class Person{
    String name;
    int age;
    Person(String name, int age){
this.name = name;
this.age = age;
    }
    void disp(){
        System.out.println(" the name is: "+ name);
        System.out.println(" the age is: "+ age);
    }
}
public class Scnerio_based_Question_1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
Person male = new Person( "Mank",21);
Person female = new Person("Kun", 19);
male.disp();
female.disp();
        sc.close();
    }
}
