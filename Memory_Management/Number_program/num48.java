package Memory_Management.Number_program;
import java.util.*;
import java.lang.Math;
//	WAP to check a number is sunny number or not
//sunny number are those no. if the number next to the given number is a perfect square. in other words, a number n will be the sunny no. in n+1 is a perfect square.
// example if n =80 , n+1 = 81 ; which is the perfect square of 9 therefore n is a sunny number. ;
public class num48 {
    static boolean sunny(long n){

n = n+1;
double squareRoot = (int)Math.sqrt(n);
System.out.println(squareRoot);
// long s =squareRoot;

if(Math.pow(squareRoot,2)==(n)){
    return true;
}
return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
 if( sunny(n)){
    System.out.println(n+ " is a sunny number");
 }else{
    System.out.println(n+ " is not a sunny  number");
 }  
        sc.close();
    }

}
