package Memory_Management.Number_program;
import java.util.*;
import java.lang.Math;
//	WAP to check if a number is Armstrong/Strong
public class num38 {
    static int counter(int n) {

        if (n <10 ) {
            return 1;
        }
        return 1+counter(n/10);
    }

    static double armstrong(int n) {
        // int num = n;
        double sum = 0;
        int count = 0;
        count = counter( n);
        int rem = 0;
        if (n == 0) {
            return 0;
        }
        for (int i = 0; i < n; i++) {
            rem = n % 10;
            n = n / 10;
            sum = Math.pow(rem, count) + sum;
            // System.out.println(sum);
        }
        sum = sum + Math.pow(n, count);
        // System.out.println(sum);
            return sum;
        
      
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i =n;i<m;i++){
            if(armstrong(i) == i)
            System.out.println(i);
        }
        sc.close();
    }
}
