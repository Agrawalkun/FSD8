package Memory_Management.Number_program;
import java.util.Scanner;
//		22.	WAP to check a number is perfect or not
public class num22 {
    static boolean sum(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
               
            }

        }
        if(sum==n){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n = sc.nextInt();
        sum(n);
if(sum(n)){
    System.out.println(n+ " is a perfect number:" );
}
else{
    System.out.println(n+ " is not a perfect number:" );
}
        sc.close();
    }
}
