package Memory_Management.Number_program;

import java.util.Scanner;

//	WAP to find all the factors/divisors of a given number
public class num19 {


    static void sum(int n){
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum = sum + i;
                System.out.println(i);
            }
        }
        // System.out.println("the sum is:" + sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n = sc.nextInt();
        // int m = sc.nextInt();
       sum(n);
    //    int res = sum(n);


        sc.close();
    }
}
