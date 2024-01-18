package Memory_Management.pattern_question;
import java.util.Scanner;
public class Ques22 {
     /*
          5 4 3 2 1
            4 3 2 1
              3 2 1
                2 1
                  1
            */
            public static void main(String[] args) {
        
    
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                 for(int i = 0 ; i<=n;i++){
                    for(int j=0;j<i;j++){
                        System.out.print("  ");
                    }
                    for(int k = i;k<n;k++){

                        System.out.print(n-k+" ");
                    }
                    System.out.println();
                
                 }
                 sc.close();
                }
}
