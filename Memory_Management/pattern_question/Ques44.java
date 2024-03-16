package Memory_Management.pattern_question;
import java.util.Scanner;
public class Ques44 {
     /*
              1
             121
            12321
           1234321
          123454321
           1234321
            12321
             121
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
                        System.out.print(k+1);
                    }
                    for(int k =1,p=0;k<=i;k++,p++){
                        System.out.print(i-p);
                    }
                    System.out.println();
                
                 }
                 for(int i =0;i<=n/2;i++){
                    for(int j =0;j<=i+1;j++){
                        System.out.print(" ");
                    }
                    for(int k =i;k<n/2;k++){
                        System.out.print(k-i+1);
                    }
                    for(int k =i+1;k<n/2;k++){
                        System.out.print(n/2-k);
                    }
                    System.out.println();
                 }
                 sc.close();
                }
}
