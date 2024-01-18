package Memory_Management.pattern_question;
import java.util.Scanner;
public class Ques7 {
  /*
     5 
     5 4
     5 4 3
     5 4 3 2
     5 4 3 2 1
     */
    public static void main(String[] args) {
        
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         for(int i = 1; i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(n-j+1+" ");
            }
            System.out.println();
        
         }
         sc.close();
        }
    
}
