package Memory_Management.pattern_question;
import java.util.Scanner;
public class Ques18 {
    /*
           5
         4 5
       3 4 5
     2 3 4 5
   1 2 3 4 5
            */
            public static void main(String[] args) {
        
    
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                 for(int i = 0 ,p=0; i<n;i++,p++){
                    for(int j=i;j<n;j++){
                        System.out.print("  ");
                    }
                    for(int k = 0;k<=i;k++){
                        System.out.print(n-p+k+" ");
                    }
                    System.out.println();
                
                 }
                 sc.close();
                }
}
