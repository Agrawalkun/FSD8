package Memory_Management.Number_program;
import java.util.Scanner;
//	WAP to find sum of all odd numbers between two given range
public class num14 {
    public static void main(String[] args) {
            
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n and m : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        float sum =0;
        for(int i =n;i<m;i++){
            if(i%2!=0){
                sum = sum+i ;
                System.out.println(i);
            } 
        }
        System.out.println("sum is: "+sum);
      
        sc.close();
}
}
