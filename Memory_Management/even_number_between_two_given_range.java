package Memory_Management;
import java.util.Scanner;

// WAP to print even number between two given range
public class even_number_between_two_given_range {
    public static void main(String[] args) {
        
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
         for(int i = n ; i<=m;i++){
            if(i%2==0){
System.out.println(i);
            }
        
                
            }
         sc.close();
        
         }
    
}
