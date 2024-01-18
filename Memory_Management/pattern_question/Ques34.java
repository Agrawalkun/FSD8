package Memory_Management.pattern_question;
import java.util.Scanner;
public class Ques34 {
     /*
         123454321
          1234321
           12321
            121
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

                        System.out.print(k-i+1);
                    }
                    for(int k =i+1 ; k<n;k++){
                        System.out.print(n-k);
                    }
                    System.out.println();
                
                 }
                 sc.close();
                }
}
