package Memory_Management.pattern_question;
import java.util.Scanner;
public class Ques25 {
      /*
          9
         987
        98765 
       9876543
      987654321
            */
            public static void main(String[] args) {
        
    
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                 for(int i = 1 ; i<=n;i++){
                    for(int j=i;j<=n;j++){
                        System.out.print(" ");
                    }
                    for(int k = 1;k<=i;k++){

                        System.out.print(2*n-k);
                    }
                    for(int k =2 ; k<=i;k++){
                        System.out.print(2*n-k-i+1);
                    }
                    System.out.println();
                
                 }
                 sc.close();
                }
}
