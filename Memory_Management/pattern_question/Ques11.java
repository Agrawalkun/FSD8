package Memory_Management.pattern_question;
import java.util.Scanner;
public class Ques11 {
     /*
     5 4 3 2 1
     5 4 3 2
     5 4 3
     5 4
     5 
            */
            public static void main(String[] args) {
        
    
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                 for(int i = 0 ; i<n;i++){
                    for(int j=i;j<n;j++){
                        System.out.print(n-j+i+" ");
                    }
                    System.out.println();
                
                 }
                 sc.close();
                }
}
