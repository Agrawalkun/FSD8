package Memory_Management.pattern_question;
import java.util.Scanner;
public class Ques37 {
    /*
              1
              12
              123
              1234
              12345
              1234
              123
              12
              1
            */
            public static void main(String[] args) {
        
    
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                 for(int i = 0 ; i<=n/2;i++){
                    for(int k =0;k<=i;k++){
                        System.out.print(k+1);
                    }
                    System.out.println();
                
                 }
                 for(int i =0;i<=n/2;i++){
                    for(int k =i;k<n/2;k++){
                        System.out.print(k-i+1);
                    }
                    System.out.println();
                 }
                 sc.close();
                }
}
