package Memory_Management;

import java.util.Scanner; // it is the input taken library , util package se sirf scanner hi lekar aaye h 
// if we want to take all the things forfusing then we write import java.util.* it is for all the library

public class scanner_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //
        int a = sc.nextInt(); // it is the method which is present in the util library so we have to make the
                              // object to call it
        System.out.println(a + 5);
        // for the float class sc.nextFloat
        float f = sc.nextFloat();
        System.out.println(f);
        // same as double
        double d = sc.nextDouble();
        System.out.println(d);
        // for the String we use sc.next() or sc.nextLine()
        String s = sc.next(); // cursor ko usiline me rkhega aur enter marne pr program end ho jana h
        System.out.println(s);
        String S = sc.nextLine(); // cursor ko next line me chla jayega enter marne par
        System.out.println(S);
        // for the character
        // sc.next().charAt(0) // jvm ko smj nhi ayega yadi koi input nhi denge to , wo
        // isko string me change kr lega isilye usko fix krne ke liye index diya jata h
        char ch = sc.next().charAt(0);
        System.out.println(ch);

        sc.close(); // it is used to close the class.
    }
}