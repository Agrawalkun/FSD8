package Memory_Management.Number_program;

import java.util.*;
import java.lang.Math;

//	WAP to check if a number is Armstrong/Strong
public class num37 {

    static int counter( int n) {

        if (n < 10) {
            return 1;
        }
        return 1+counter(n/10);  
    }

    static boolean armstrong(int n) {
        int num = n;
        double sum = 0;
        int count = 0;
        count = counter(n);
        System.out.println(count);
        int rem = 0;
        if (n == 0) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            rem = n % 10;
            n = n / 10;
            sum = Math.pow(rem, count) + sum;
            System.out.println(sum);
        }
        sum = sum + Math.pow(n, count);
        System.out.println(sum);
        if (sum == num) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        if (armstrong(n)) {
            System.out.println(n + " is a armstrong no.");
        } else {
            System.out.println(n + " is not a armstrong no.");
        }
        sc.close();
    }
}
