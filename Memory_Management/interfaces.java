package Memory_Management;
interface Draw{
   public final int a =10; // it will not change , by default value final hogi isko change nhi kr skte.
    public abstract void draw();
}
class rectangle implements Draw{
public void draw(){
   // a = 23;// this will give the error because it is the final value.
    System.out.println("Drawing rectangle");
}
}
class square implements Draw{
    public void draw(){
        System.out.println("Drawing square");
    }
}

public class interfaces {
    // Interface : 100% hiding 
    // interface keyword sath jo method banta h wo abstract hi bangega uske andar kuch nhi likh skte
    // interface draw{
       // void eat(){ this will give error...
       // }
       // void eat(); // this is the abstract method so it will not give the error.
   // }
   public static void main(String[] args){
    rectangle r = new rectangle();
    r.draw();
    square s = new square();
    s.draw();
   }
}
