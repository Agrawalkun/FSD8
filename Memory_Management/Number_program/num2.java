package Memory_Management.Number_program;
//	WAP to display all whole numbers up-to n
import java.util.Scanner;
public class num2 {
    
        public static void main(String[] args) {
            
        
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for(int i =0;i<=n;i++){
                System.out.println(i);
            }
            sc.close();
    }
}

