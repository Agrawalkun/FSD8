package Memory_Management.pattern_question;
import java.util.Scanner;
public class Ques10 {
    /*
     1 2 3 4 5
     1 2 3 4
     1 2 3
     1 2
     1 
            */
            public static void main(String[] args) {
        
    
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                 for(int i = 0 ; i<n;i++){
                    for(int j=i+1;j<=n;j++){
                        System.out.print(j-i+" ");
                    }
                    System.out.println();
                
                 }
                 sc.close();
                }
}
