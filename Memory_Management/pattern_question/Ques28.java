package Memory_Management.pattern_question;
import java.util.Scanner;
public class Ques28 {
     /*
         *********
          *******
           *****
            ***
             *
            */
            public static void main(String[] args) {
        
    
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                 for(int i = 1 ; i<=n;i++){
                    for(int j=0;j<i;j++){
                        System.out.print(" ");
                    }
                    for(int k = i;k<=n;k++){

                        System.out.print("*");
                    }
                    for(int k =i ; k<n;k++){
                        System.out.print("*");
                    }
                    System.out.println();
                
                 }
                 sc.close();
                }
}
