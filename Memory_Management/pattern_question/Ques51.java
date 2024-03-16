package Memory_Management.pattern_question;
import java.util.Scanner;

/*
	 1
     11
     121
     1331
     14441
 */
public class Ques51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // char n = sc.next().charAt(0);
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j <=i; j++) {
               if( j==0 ||i==j){
                System.out.print(1);
               }else{
                System.out.print(i);
               }
            }   
            System.out.println();
        } 
        sc.close();
    }
}
