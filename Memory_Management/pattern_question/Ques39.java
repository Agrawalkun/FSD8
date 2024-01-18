package Memory_Management.pattern_question;
import java.util.Scanner;
public class Ques39 {
     /*
              5
              45
              345
              2345
              12345
              2345
              345
              45
              5
            */
            public static void main(String[] args) {
        
    
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                 for(int i = 0 ; i<=n/2;i++){
                    for(int k =0;k<=i;k++){
                        System.out.print(n/2+k-i+1);
                    }
                    System.out.println();
                
                 }
                 for(int i =0;i<=n/2;i++){
                    for(int k =i+1;k<=n/2;k++){
                        System.out.print(k+1);
                    }
                    System.out.println();
                 }
                 sc.close();
                }
}
