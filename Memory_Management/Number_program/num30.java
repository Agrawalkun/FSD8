package Memory_Management.Number_program;

import java.util.Scanner;

//	WAP to swap two numbers using third variable
public class num30 {
    static void swap(int a, int b) {
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("enter the value of a: " + a);
        System.out.println("enter the value of b: " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        swap(a, b);

        sc.close();
    }
}
