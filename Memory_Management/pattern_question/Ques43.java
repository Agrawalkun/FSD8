package Memory_Management.pattern_question;
import java.util.Scanner;
public class Ques43 {
     /*
              1
             123
            12345
           1234567
          123456789
           1234567
            12345
             123
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
                    for(int k =1;k<=i;k++){
                        System.out.print(k+i+1);
                    }
                    System.out.println();
                
                 }
                 for(int i =0,p=0;i<=n/2;i++,p++){
                    for(int j =0;j<=i+1;j++){
                        System.out.print(" ");
                    }
                    for(int k =i;k<n/2;k++){
                        System.out.print(k-i+1);
                    }
                    for(int k =i+1;k<n/2;k++){
                        System.out.print(n/2+k-p-i);
                    }
                    System.out.println();
                 }
                 sc.close();
                }
}
