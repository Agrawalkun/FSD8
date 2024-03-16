package Memory_Management.Number_program;
import java.util.Scanner;
//	WAP to find sum of all natural numbers up-to n
public class num8 {
    public static void main(String[] args) {
            
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n : ");
        int n = sc.nextInt();
        int sum =0;
        for(int i =1;i<=n;i++){
            sum = sum+i ;
        }
        System.out.println(sum);
        sc.close();
}
}
