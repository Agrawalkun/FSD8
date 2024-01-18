package Memory_Management.pattern_question;
import java.util.Scanner;
public class Ques8 {
     /*
     5 
     4 5
     3 4 5
     2 3 4 5
     1 2 3 4 5
     */
    public static void main(String[] args) {
        
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         for(int i = 0 , p=0; i<n;i++,p++){
            for(int j=0;j<=i;j++){
                System.out.print(n-p +j+" ");
            }
            System.out.println();
        
         }
         sc.close();
        }
    
}
