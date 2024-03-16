package Memory_Management.Number_program;

import java.util.Scanner;

//		WAP to print all perfect numbers between two given range
public class num23 {
    static boolean sum(int n) {
        int sum = 0;
        // for (int i = n; i < m; i++) {
        for (int j = 1; j < n; j++) {
            if (n % j == 0) {
                sum = sum + j;
                // System.out.println(i);

            }
        }
        if (sum == n) {
            // System.out.println(n+ " is a perfect number:" );
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n and m : ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = n; i <= m; i++) {
            if (sum(i)) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
