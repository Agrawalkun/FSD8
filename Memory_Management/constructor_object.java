package Memory_Management;

public class constructor_object {
    public static void main(String[] args) {
        // int x =90;  
      // constructor_object anu= new constructor_object(); default constructor 
       constructor_object sans= new constructor_object( 20, "Sans", "BUIT" );
       constructor_object kun= new constructor_object(21 , "Kun", "BUIT");
       constructor_object mank= new constructor_object( 21, "Mank" , "BUIT");
       constructor_object niks= new constructor_object( 21,"Niks", "BUIT");
       System.out.println();
       System.out.println( sans.age);
       System.out.println( sans.clg_name);
       System.out.println( mank.name);
       System.out.println( niks.age);
       System.out.println( kun.clg_name); 
    
  
      
        
    }
           constructor_object(int x,String N , String M ){  // parameterised constructor
      //
          age  =x;
          name = N;
         clg_name = M;

    }
 
    // int age = 12 ;
    // String name = "me";
    // String clg_name = "pta nhi";  these  are instance variable because it doest not creat inside any method because method have its stack and we want to put the information inside the object
    // but this instance variable fix the value of each object that we created which is the big problem , so we use parameterised constructor to change the value
int age;
String  name ;
String clg_name ; 

}
