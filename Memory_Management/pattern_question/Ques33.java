package Memory_Management.pattern_question;
import java.util.Scanner;
public class Ques33 {
     /*
         543212345
          5432345
           54345
            545
             5
            */
            public static void main(String[] args) {
        
    
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                 for(int i = 0 ; i<n;i++){
                    for(int j=0;j<i;j++){
                        System.out.print(" ");
                    }
                    for(int k = i;k<n;k++){

                        System.out.print(n-k+i);
                    }
                    for(int k =i+1 ; k<n;k++){
                        System.out.print(k+1);
                    }
                    System.out.println();
                
                 }
                 sc.close();
                }
}
