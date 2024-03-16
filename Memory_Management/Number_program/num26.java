package Memory_Management.Number_program;
import java.util.Scanner;
//		WAP to print alternate prime numbers between two given range
public class num26 {
    static boolean factor(int n) {
       
        int count = 0;
        if(n<2){
            return false;
        }
        for (int i = 2; i < n; i++) {
           
                // counter ++;
            if (n % i == 0 ) {
                count++;
            }

        }

        if(count!=0 ){
            return false;
          
        }
       return true;
       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n and m: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int counter =0;
        for(int i = n;i<=m;i++){
            
             if(factor(i) ){
                if(counter%2==0){
                System.out.println(i + " is prime");
              
                }
                counter ++;
            }

        }
        
       
        sc.close();
    }
}
