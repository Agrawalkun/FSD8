package Memory_Management.Number_program;
import java.util.Scanner;
//	WAP to display all odd natural numbers up-to n
public class num4 {
    public static void main(String[] args) {
            
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0;i<=n;i++){
            if(i%2!=0){
                System.out.println(i);
            }
           
        }
        sc.close();
}
}
