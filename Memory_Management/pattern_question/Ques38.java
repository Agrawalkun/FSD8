package Memory_Management.pattern_question;
import java.util.Scanner;
public class Ques38 {
    /*
              5
              54
              543
              5432
              54321
              5432
              543
              54
              5
            */
            public static void main(String[] args) {
        
    
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                 for(int i = 0 ; i<=n/2;i++){
                    for(int k =0;k<=i;k++){
                        System.out.print(n/2-k+1);
                    }
                    System.out.println();
                
                 }
                 for(int i =0;i<=n/2;i++){
                    for(int k =i;k<n/2;k++){
                        System.out.print(n/2-k+i+1);
                    }
                    System.out.println();
                 }
                 sc.close();
                }
}
