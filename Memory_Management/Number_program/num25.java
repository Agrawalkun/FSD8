package Memory_Management.Number_program;
import java.util.Scanner;
//	WAP to print all the prime numbers between two given range
public class num25 {
    static boolean factor(int n) {
        int count = 0;
        if(n<2){
            return false;
        }
      
        for (int i = 2; i < n; i++) { // the time complexity of this is O(n) 
            if (n % i == 0 ) {
                count++;
            }

        }
        if(count>0){
            return false;
        }
       return true;
       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n and m: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = n;i<=m;i++){
           
             if(factor(i)){
                System.out.println(i + " is prime");
            }

        }
        
       
        sc.close();
    }
}
