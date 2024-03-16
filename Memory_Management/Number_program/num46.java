package Memory_Management.Number_program;
import java.util.*;
import java.lang.Math;
//	WAP to check a number is Automorphic or not
// Automorphic number are those integer whose square ends with the given integer 
// example: (25)^2 = 625  here once place of the 25 is equal to the once place of the square of the number.
public class num46 {
    static boolean automorphic(int n){
        double square;
        if(n==0){
            return true;
        }
        else{
square = Math.pow(n,2);  
System.out.println(square);
n = n%10;
square = square%10;
      }
      if(n==square){
        System.out.println(n + " "+ square);
        return true;
        
      }
      return false;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
 if( automorphic(n)){
    System.out.println(n+ " is an automorphic number");
 }else{
    System.out.println(n+ " is not an automorphic number");
 }
       
        
        sc.close();
    }
}
