package Memory_Management.pattern_question;
import java.util.Scanner;

/*
   12345
   12345
   12345
   12345
   12345
 */
public class Ques2 {
    public static void main(String[] args) {
        
    
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
 for(int i = 0; i<n;i++){
    for(int j=1;j<=n;j++){
        System.out.print(j);
    }
    System.out.println();

 }
 sc.close();
}
}
