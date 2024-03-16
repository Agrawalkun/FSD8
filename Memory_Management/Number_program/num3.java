package Memory_Management.Number_program;
//	WAP to display all even natural numbers up-to n
import java.util.Scanner;
public class num3 {
    public static void main(String[] args) {
            
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
           
        }
        sc.close();
}
}
