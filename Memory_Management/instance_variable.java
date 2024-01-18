package Memory_Management;

public class instance_variable {

           int x; // instant variable
    public static void main(String[] args) {
 

 instance_variable x= new  instance_variable(5);
 System.out.println(x.x); 
     }
   instance_variable( int m){ // parameterised constructor
x=m;
 }
       

}
