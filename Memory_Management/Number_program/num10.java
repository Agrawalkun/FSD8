package Memory_Management.Number_program;
// 	WAP to find sum of all whole numbers up-to n
import java.util.Scanner;
public class num10 {
    public static void main(String[] args) {
            
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n : ");
        int n = sc.nextInt();
        int sum =0;
        for(int i =0;i<n;i++){
            sum = sum+i ;
        }
        System.out.println(sum);
        sc.close();
}
}
