package Memory_Management.pattern_question;
import java.util.Scanner;
public class Ques24 {
     /*
          1
         123
        12345 
       1234567
      123456789
            */
            public static void main(String[] args) {
        
    
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                 for(int i = 1 ; i<=n;i++){
                    for(int j=i;j<=n;j++){
                        System.out.print(" ");
                    }
                    for(int k = 1;k<=i;k++){

                        System.out.print(k);
                    }
                    for(int k =2 ; k<=i;k++){
                        System.out.print(k+i-1);
                    }
                    System.out.println();
                
                 }
                 sc.close();
                }
}
