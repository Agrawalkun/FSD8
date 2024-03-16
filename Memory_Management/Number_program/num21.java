package Memory_Management.Number_program;
import java.util.Scanner;
//		WAP to find sum of all the factors/divisors of a given number
public class num21 {
    static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum = sum + i;
                // System.out.println(i);
               
            }
        }
        // System.out.println("the sum is:" + sum);
        return sum;
      
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n = sc.nextInt();
        sum(n);
        System.out.println("the sum is:" + sum(n));
        sc.close();
    }

}
