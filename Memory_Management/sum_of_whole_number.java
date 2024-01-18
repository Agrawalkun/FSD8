package Memory_Management;
import java.util.Scanner;
//write a program to print the sum of whole number
public class sum_of_whole_number {
    public static void main(String[] args) {
        
    
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int sum = 0;
         for(int i = 0; i<n;i++){
           sum = sum+i;
           
        
         }
         System.out.println("sum of n whole number is: "+sum);
         sc.close();
        }
}
