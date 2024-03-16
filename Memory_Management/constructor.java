package Memory_Management;
 // can we overload constructors?
    // overloading: 1. name of the method is same
    // 2. change in signature - a. no. of parameter is change
    //                          b. change in the data type of the parameter
    //                           c. change in the order of the parameter.
    //

class employee{
String name;
int id;
double salary;

employee(String name, int id,double salary){
    this.name = name;
    this.salary = salary;
    this.id = id;

}
employee(String name, double salary,int id){
    this.name = name;
    this.salary = salary;
    this.id = id;
   

}
void disp(){
System.out.println("name: "+name);
System.out.println("id: "+id);
System.out.println("salary: "+salary);
}
// is constructor returns anything
employee(){
    System.out.println("Object Constructed"); // constructor returns the instance of the class that is object.
}
// Copy constructor
employee(String name,int id){
this.name = name;
this.id = id;

}
employee(employee e){
name = e.name;
id = e.id;

}

}
public class constructor {
    public static void main(String[] args) {
        employee e1 = new employee("Tillu",40000.00,20);
        e1.disp();
        employee e2 = new employee("Tillu",420,40000.420);
        e2.disp();
        employee e3 = new employee();
        System.out.println(System.identityHashCode(e3)); // print the address of the object 
        employee e4 = new employee();
        System.out.println(System.identityHashCode(e4));
        // copy constructor
        employee e5 = new employee("Ti2",42);
        e5.disp();
        employee e6 = new employee(e5);
        e6.disp();


    }
// dynamic dispatch : no. of argument ke according hi compiler method ko call krta h , jaisa no. of argument dikhega waisa method call ho jayega.

}
