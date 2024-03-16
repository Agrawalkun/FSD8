package Memory_Management.Number_program;
import java.util.Scanner;
//	WAP to find the average of all natural numbers up-to n
public class num11 {
    public static void main(String[] args) {
            
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n : ");
        int n = sc.nextInt();
        float sum =0;
        for(int i =1;i<=n;i++){
            sum = sum+i ;
        }
        float avg = sum/n ;
        System.out.println(sum);
        System.out.println(avg);
        sc.close();
}
}
