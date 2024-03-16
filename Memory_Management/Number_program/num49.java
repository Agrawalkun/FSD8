package Memory_Management.Number_program;
import java.util.*;
import java.lang.Math;
//	WAP to check a number is tech number or not
//tech number are those no. if the no. of digit in the given no.is even then the sum of the two parts and square it is equal to the same given no.

public class num49 {
    static int count(int n) {
        if (n < 10) {
            return 1;
        }
        return 1 + count(n / 10);
    }
    static boolean tech(int n) {
        int count = count(n);
        int num = n;
        System.out.println(count);
        if (count % 2 == 0) {
            count = count / 2;
            for (int j = 0; j < count; j++) {
                num = num / 10;
            }
            double remaining_num = n - num * Math.pow(10, count);
            System.out.println(num);
            System.out.println(remaining_num);

            double sum = 0;
            sum = num + remaining_num;

            sum = Math.pow(sum, 2);
            System.out.println(sum);
            if(sum == n){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        if (tech(n)) {
            System.out.println(n + " is a tech number");
        } else {
            System.out.println(n + " is not a tech  number");
        }
        sc.close();
    }
}
