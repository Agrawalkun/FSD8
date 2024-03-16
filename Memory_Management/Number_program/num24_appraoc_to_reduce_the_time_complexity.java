package Memory_Management.Number_program;
import java.util.Scanner;
public class num24_appraoc_to_reduce_the_time_complexity {
    //	WAP to check if a number is prime or not
    static boolean factor(int n) {
        int count = 0;
        if(n<2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) { // by using the sqrt it uses the time complexity from O(n) to O(log (sqrt of n))
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
        System.out.println("enter the value of n and m: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        // sum(n);
       
         for(int i=n;i<=m;i++){
        if(factor(i)){
            System.out.println(i + "  number is prime");
        }
    }
        sc.close();
    }
}
