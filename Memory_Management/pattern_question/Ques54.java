package Memory_Management.pattern_question;
import java.util.Scanner;

/*
*                *
* *            * *
*   *        *   *
*     *   *      *
*      **        *
*     *    *     *
*   *        *   *
* *            * *
*                *


 */
public class Ques54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // char n = sc.next().charAt(0);
         for(int i = 0 ; i<n;i++){
            for(int j=0; j<n;j++){
               if(j==0 ||i==j||i+j==n-1 && j!=n/2||j==n-1 || i==j+1&&i==n/2||j==n/2&&i==n/2-1 && n%2==0){
                System.out.print("*");
               }
             else{
                System.out.print(" ");
             } 
            }
           
            System.out.println();
        
         }
         sc.close();
}
}
