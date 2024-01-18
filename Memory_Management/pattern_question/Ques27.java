package Memory_Management.pattern_question;
import java.util.Scanner;
public class Ques27 {
    /*
          1
         212
        32123 
       4321234
      543212345
            */
            public static void main(String[] args) {
        
    
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                 for(int i = 1,p=n ; i<=n;i++,p--){
                    for(int j=i;j<=n;j++){
                        System.out.print(" ");
                    }
                    for(int k = 0;k<i;k++){

                        System.out.print(n-k-p+1);
                    }
                    for(int k =1 ; k<i;k++){
                        System.out.print(k+1);
                    }
                    System.out.println();
                
                 }
                 sc.close();
                }
}
