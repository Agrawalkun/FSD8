package Memory_Management.Number_program;
import java.util.Scanner;
//	WAP to print sum of digits of a given number
public class num15 {
    public static void main(String[] args) {
            
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n and m : ");
        int n = sc.nextInt();
        int sum =0;
       int remainder=0;
        for(int i =0; i<=n;i++){
            if(n%10!=0 ){
           
            remainder = n%10;
      
                sum = sum +remainder;
                n= n/10;
                System.out.println(remainder);
               
            }
        }

          sum = sum +n;
        System.out.println("sum is: "+sum);
        
        sc.close();
     
}
}

