package Memory_Management.Number_program;
import java.util.Scanner;
//	WAP to display all natural numbers up-to n
public class num1 {
    public static void main(String[] args) {
        
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            System.out.println(i);
        }
        sc.close();
}

}
