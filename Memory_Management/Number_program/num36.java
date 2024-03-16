package Memory_Management.Number_program;
import java.util.Scanner;
//	WAP to find gcd/hcf of  given numbers with recursion
public class num36 {
static int gcd(int div,int divi){
    int rem = divi%div;
    if(div==0||div> divi){
        return 0;
    }
    else if(divi%div==0){
        return div;
    }
    return gcd(rem,div);
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n and m : ");
        int div = sc.nextInt();
        int divi = sc.nextInt();
            System.out.println(gcd(div,divi));
        sc.close();
    }
}
