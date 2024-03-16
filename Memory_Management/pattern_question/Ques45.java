package Memory_Management.pattern_question;
import java.util.Scanner;
public class Ques45 {
     /*
              1
             212
            32123
           4321234
          543212345
           4321234
            32123
             212
              1

            */
            public static void main(String[] args) {
        
    
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                 for(int i = 0 ; i<=n/2;i++){
                    for(int j=i; j<=n/2;j++){
                        System.out.print(" ");
                    }
                    for(int k =0;k<=i;k++){
                        System.out.print(i+1-k);
                    }
                    for(int k =1;k<=i;k++){
                        System.out.print(k+1);
                    }
                    System.out.println();
                
                 }
                 for(int i =0;i<=n/2;i++){
                    for(int j =0;j<=i+1;j++){
                        System.out.print(" ");
                    }
                    for(int k =i;k<n/2;k++){
                        System.out.print(n/2-k);
                    }
                    for(int k =i+1;k<n/2;k++){
                        System.out.print(k+1-i);
                    }
                    System.out.println();
                 }
                 sc.close();
                }
}
