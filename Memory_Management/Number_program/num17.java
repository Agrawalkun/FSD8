package Memory_Management.Number_program;

import java.util.Scanner;
//	WAP to reverse a given number
public class num17 {
    static int reverse(int n) {
        if(n<10){
            return n;
        }
        else{
            System.out.print(reverse(n%10));
            return   reverse(n/10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n and m : ");
        int n = sc.nextInt();
        System.out.println(reverse(n));
        sc.close();
    }
}
