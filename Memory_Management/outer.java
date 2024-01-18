package Memory_Management;

public class outer {

           int x;
    public static void main(String[] args) {
 outer x= new outer();
 System.out.println(x.x);
 outer1 y = new outer1();
 y.y = 70; // updating the previous value of y
 System.out.println(y.y);
 outer3 jk= new outer3() ; // creating the object for the non-static method
jk.xyz();
  outer3.ct k = jk.new ct(); // creating the object of class inside the class

System.out.println(k.k);


//xyz();

    
    }
//  static int xyz( ){

// outer x= new outer();
// System.out.println(x.x);
// return 0;

//         }
       

}
 class outer1{
    int y; // ye apna  instance variable h 

 }
class outer3{
       int xyz(){
        System.out.println("hi");
    

return 0;
}
class ct{
    int k=90;
}
}