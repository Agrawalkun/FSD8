package Memory_Management;
import java.util.Scanner;
// write a program to print sum of n natural number
public class sum_of_n_natural_number {
    public static void main(String[] args) {
        
    
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int sum = 0;
         for(int i = 1; i<=n;i++){
           sum = sum+i;
           
        
         }
         System.out.println("sum of n natural number is: "+sum);
         sc.close();
        }
}
