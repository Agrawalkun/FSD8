package Memory_Management.pattern_question;
import java.util.Scanner;
public class Ques30 {
     /*
         987654321
          9876543
           98765
            987
             9
            */
            public static void main(String[] args) {
        
    
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                 for(int i = 0 ,p=0; i<n;i++,p++){
                    for(int j=0;j<i;j++){
                        System.out.print(" ");
                    }
                    for(int k = i+1;k<=n;k++){

                        System.out.print(2*n-k+i);
                    }
                    for(int k =i+1 ; k<n;k++){
                        System.out.print(n-k+p+i);
                    }
                    System.out.println();
                
                 }
                 sc.close();
                }
}
