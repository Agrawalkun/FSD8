package Memory_Management.pattern_question;
import java.util.Scanner;
public class Ques32 {
     /*
         543212345
          4321234
           32123
            212
             1
            */
            public static void main(String[] args) {
        
    
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                 for(int i = 0 ; i<n;i++){
                    for(int j=0;j<i;j++){
                        System.out.print(" ");
                    }
                    for(int k = i;k<n;k++){

                        System.out.print(n-k);
                    }
                    for(int k =i+1 ; k<n;k++){
                        System.out.print(k-i+1);
                    }
                    System.out.println();
                
                 }
                 sc.close();
                }
}
