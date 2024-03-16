package Memory_Management.pattern_question;
import java.util.Scanner;

/*
  				ABCDE
                ABCD
                ABC
                AB
                A
                AB
                ABC
                ABCD
                ABCDE

 */
public class Ques58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // char n = sc.next().charAt(0);
        
        for (int i = 0; i <= n / 2; i++) {
            for (int j = i; j <= n / 2; j++) {
                System.out.print((char) ('A' + j-i));
            }
            System.out.println();
        }
        for (int i = 1; i <= n / 2; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + j));
            }
            System.out.println();
        }
        
        sc.close();
    }
}
