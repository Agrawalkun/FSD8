package Memory_Management.Number_program;

import java.util.*;
import java.lang.*;

//	WAP to check a number is Keith Number or not
// when the no. is appear int the special sequence then the number is known as the keith number. the special sequence form by adding the digit of original no. and the new digit occur then add the previous three no. if the original number comes in this sequence then it is the keith no. otherwise not.
// lets take an example: 197 is the original no. digits of this no. is 1, 9 ,7 now add these no. wee get 17 now add previous three no. to make the sequence , now the no. is 9,7,17 repeat is until the 197 is not come. if it comes in this series then the no. is the keith no.
public class num51 {
    static boolean keith(int n) {
        int rem = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            rem = n % 10;
            n = n / 10;
            int rem1 = rem;
            System.out.println(rem1);
            sum = sum + rem;
        }
        sum = sum + n;
        System.out.println(sum);
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        if (keith(n)) {
            System.out.println(n + " is a keith number");
        } else {
            System.out.println(n + " is not a keith number");
        }
        // System.out.println("Int max: "+Integer.MAX_VALUE);
        // System.out.println("Int min: "+Integer.MIN_VALUE);
        // System.out.println("Int size: "+Integer.BYTES);
        //  System.out.println("Int size: "+Integer.SIZE);
        char x = 0x03C8;
        System.out.println(x); //it is not display the symbol sai ( invert it ₼)
        // becially it is not displaying the greek Symbol.
        // Greek symbol
        // for(char c =0x0370;c<=0x03FF;c++){
        //     System.out.print(c+ " ");
        // } not displaying...
        // devangari Symbol hindi alphabet..
        // for(char c =0x0900;c<=0x0970;c++){
        //     System.out.print(c+ " ");
        // } not displaying...

        sc.close();
    }
}
