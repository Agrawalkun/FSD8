package Memory_Management;
class EXAMPLE{
    String name;
    String address;
    public int PIN = 1234;
    private int pin;

    EXAMPLE(String name,String address){
        this.address = address;
        this.name = name;
        // this.pin = pin;
    }
    // setter: setting the values  for private data member
    public int setpin( int pin){ // public isliye kiya to ye  controlled access milega agar private krte to user bhi use nhi kr payega.
        this.pin = pin;
return pin;
    }
    // getter: get the details to the user
    public void getpin(){ // public isliye kiya to ye  controlled access milega agar private krte to user bhi use nhi kr payega.
        // get methpod me condition dekar controlled access de skte h.
        System.out.println("pin is "+pin);
    }
    void disp(){
        System.out.println("Name is "+name);
        System.out.println("Address is "+address);
        System.out.println("PIN is "+PIN);
        System.out.println("pin is "+pin);
    }

}
public class encapsulation {
    // encapsulation means the bindinng important data and method into a single unit.
    // controlled access di jati h user ko. 100% data hiding nhi hota h.
    // binding the data in the controlled access.
   // public: access to all
   // private: give permission to access the data.
    // getter and setter (get and set method)give the controlled access to the private method.
    public static void main(String[] args) {
        EXAMPLE e = new EXAMPLE( "pintu","Bhopal");
        e.disp();
        // name and address are default and pin is public so we can access the all three in other  class.
System.out.println(e.name);
System.out.println(e.address);
System.out.println(e.PIN);
 // System.out.println(e.pin);  class ka khudka object bhi private ko access nhi kr paa rha.
 e.setpin(2002); // it help to set the pin
 e.getpin(); // it will help to get the pin

    }
}
