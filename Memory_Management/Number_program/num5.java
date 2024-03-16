package Memory_Management.Number_program;
import java.util.Scanner;
//	WAP to display all numbers between two given range
public class num5 {
    public static void main(String[] args) {
            
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n amd m: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i =n;i<m;i++){
                System.out.println(i);
            
           
        }
        sc.close();
}
}
