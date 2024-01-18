package Memory_Management.pattern_question;
import java.util.Scanner;
public class Ques35 {
     /*
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * *
        * * *
        * *
        *
            */
            public static void main(String[] args) {
        
    
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                 for(int i = 0 ; i<=n/2;i++){
                    for(int j=0;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                
                 }
                 for(int i =0;i<n/2;i++){
                    for(int j =i;j<n/2;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                 }
                 sc.close();
                }
}
