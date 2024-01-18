package Memory_Management.pattern_question;
import java.util.Scanner;
public class Ques26 {
     /*
          1
         121
        12321 
       1234321
      123454321
            */
            public static void main(String[] args) {
        
    
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                 for(int i = 1,p=n ; i<=n;i++,p--){
                    for(int j=i;j<=n;j++){
                        System.out.print(" ");
                    }
                    for(int k = 1;k<=i;k++){

                        System.out.print(k);
                    }
                    for(int k =1 ; k<i;k++){
                        System.out.print(n-k-p+1);
                    }
                    System.out.println();
                
                 }
                 sc.close();
                }
}
