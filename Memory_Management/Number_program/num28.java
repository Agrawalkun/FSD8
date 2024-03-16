package Memory_Management.Number_program;
import java.util.Scanner;
//	28.	WAP to print factorial of a given number without recursion
public class num28 {

    static int fact(int n){
        int fact =1;
        if(n==0){
return 0;
        }
        else{
 for(int i =1;i<=n;i++){
    fact = fact*i;
 }
}
 return fact;
    }   
    
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n : ");
    int n = sc.nextInt();
    // int m = sc.nextInt();
   System.out.println("The factorial of "+ n +" is: " +fact(n));
    sc.close();
}
}
