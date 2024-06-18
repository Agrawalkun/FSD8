package Memory_Management;
// WAP to  create a class called "DOG" with a name and breed attribute. Create two instances of the "DOG" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.

class DOG{
String name;
String breed;
DOG(String name, String breed){
    this.name = name;
    this.breed = breed;
}
 void setter(String name , String breed) {
    this.name = name;
    this.breed = breed;
}
void disp(){
    System.out.println("the name is "+ name);
    System.out.println("the breed is "+ breed);
}
}
public class Scnerio_based_Question_2 {
    public static void main(String[] args) {
        DOG getName = new DOG("Sherry" ,"golderritriber");
        DOG getname = new DOG("Sherry" ,"golderritriber");
        getName.setter("Nikki","Jangli Kutta");
        getName.disp();
        getname.setter("Mankshii","manipulator kutta");
        getname.disp();
    }
}
