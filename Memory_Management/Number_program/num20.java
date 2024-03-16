package Memory_Management.Number_program;

import java.util.Scanner;

//	20.	WAP to count the number of factors/divisors of a given number
public class num20 {
    static int sum(int n) {
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum = sum + i;
                // System.out.println(i);
                count++;
            }

        }
        // System.out.println("the sum is:" + sum);
        // System.out.println("the count is:" + count);
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n = sc.nextInt();
        // int m = sc.nextInt();
        sum(n);
        int res = sum(n);
        System.out.println("the count is :" + res);

        sc.close();
    }

}
