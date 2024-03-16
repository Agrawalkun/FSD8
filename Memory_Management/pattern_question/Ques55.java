package Memory_Management.pattern_question;

import java.util.Scanner;

/*
  	A
    BC
    DEF
    GHIJ
    KLMNO


 */
public class Ques55 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int p = 0;
    // char n = sc.next().charAt(0);
    for (int i = 0; i < n; i++) {

      for (int j = 0; j <= i; j++) {

        System.out.print((char) ('A' + p));
        p++;
      }

      System.out.println();

    }
    sc.close();
  }
}
