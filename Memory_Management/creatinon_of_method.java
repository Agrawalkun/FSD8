package Memory_Management;

public class creatinon_of_method {
    int x; // instance variable
    public static void main(String[] args) {
       static_method(); // calling of static method
     //   non_static_method(); // we can't call the non-static method directly, therefore we have to create object 

    // new non_static_method(); why it is showing a error when we are making the object of name non_static_method
    new creatinon_of_method (); // creation of object with the help of new keywords and the class name 
creatinon_of_method  h =  new creatinon_of_method (); // calling of object and holding the adress of address
// h is the refference variable which is reffering the address of the object
h.non_static(); // calling of non-static method
System.out.println(h.x); // printing the value of instance variable


    }
     int method() {
        // Syntax of method creation
        return 0;
    }
    // Syntax of creation of static method
    static int static_method(){
int z=10;
System.out.println(z);
return 0;
    }
    // Syntax of creation of non-static method
int non_static(){
int y=2; // we can not access the local variable of method in the main 
// only instance variable can be access in the main

System.out.println(y);
   return 0;
}
}
