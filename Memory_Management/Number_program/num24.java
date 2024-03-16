package Memory_Management.Number_program;
import java.util.Scanner;
//	WAP to check if a number is prime or not
public class num24 {
    static boolean factor(int n) {
       
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0 ) {
                count++;
            }

        }
        if(count>0){
            return false;
        }
        else{
            return true;
        }
       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n = sc.nextInt();
        // int m = sc.nextInt();
        // sum(n);
         factor(n);
        if(factor(n)){
            System.out.println("number is prime");
        }
        else{
        System.out.println("the  number is not prime" );
        }
        sc.close();
    }
}
