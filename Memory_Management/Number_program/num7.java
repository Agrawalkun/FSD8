package Memory_Management.Number_program;
import java.util.Scanner;
//	WAP to find all odd numbers between two given range
public class num7 {
    public static void main(String[] args) {
            
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n amd m: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i =n;i<m;i++){
            if(i%2!=0){
                System.out.println(i);
            }
                
            
           
        }
        sc.close();
}
}
