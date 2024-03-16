package Memory_Management.pattern_question;
import java.util.Scanner;

/*
        *
       * *
      *   *
     *     *
    *       *
     *     *
      *   *
       * *
        *

 */
public class Ques52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // char n = sc.next().charAt(0);
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
               if( i+j==n/2||j-i==n/2||i-j==n/2|| (i+j)==n+(n/2)-1){
                System.out.print("*");
               }else{
                System.out.print(" ");
               }
            }   
            System.out.println();
        } 
        sc.close();
    }
}
