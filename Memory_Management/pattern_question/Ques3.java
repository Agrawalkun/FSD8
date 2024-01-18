package Memory_Management.pattern_question;
import java.util.Scanner;
public class Ques3 {
    /*
   11111
   22222
   33333
   44444
   55555
 */
    public static void main(String[] args) {
        
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         for(int i = 1; i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(i);
            }
            System.out.println();
        
         }
         sc.close();
        }
    
}
