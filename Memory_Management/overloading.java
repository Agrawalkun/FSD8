package Memory_Management;

import java.util.*;

public class overloading {
    static int add(int a, int b, int c) {
        int d = a + b + c;
        return d;
    }

    static int add(int a, int b) {
        int c = a + b;
        return c;
    }

    static double add(double a, double b) {
        double c = a * b;
        return c;
    }
    // short long and int belog to same family then order change krne pr bhi error show hoga
static int add(short a, int b) {
        int c = a - b;
        return c; 
    }
static int add(int a, short b) {
        int c = a + b;
        return c; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b : ");
        short b = sc.nextShort();

        System.out.println("Enter the value of c : ");
        int c = sc.nextInt();
        System.out.println("Enter the value of d : ");
        double d = sc.nextDouble();
        System.out.println("Enter the value of e : ");
        double e = sc.nextDouble();
        System.out.println("the sum of two values :" + add(d,e)); // passing two values
        System.out.println("the sum of two values :"+add(a,b)); // passing two values
        // System.out.println("the sum of two values :"+add(10,20));  it give the error because short and int both are same data type
        System.out.println("the sum of two values :" + add(a, b, c));// passing three values

        sc.close();
    }
}
