package Memory_Management;
// non-static method
public class non_static {
    public static void main(String[] args) {
        new non_static(); // error does not shows because this new is the name to create the object and it is the special kind of the method called constructor and it does not need to create because it creat itslef internally in the backend
// fgh(); shows rerror because we do not call non-static method directly

//onstructor do nt return anything.
//it doesn't have any data type
// It is the only method which do not return anything and doesn't have any data type
// It's name always same as class name
    }
    int fgh(){
        new joy(); // calling of constructor
 return 5;
    }
}
class joy{
    joy(){ // creation of constructor

    }
    public static void main(String[] args) {
         non_static h = new non_static(); // h is pointing the address of the object , it is not an object
         h.fgh();// calling of non static method
    }
}
// new + constructor = object