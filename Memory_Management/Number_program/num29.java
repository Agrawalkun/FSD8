package Memory_Management.Number_program;
import java.util.Scanner;
//	28.	WAP to print factorial of a given number  recursion
public class num29 {
    static int fact(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of n:");
int n = sc.nextInt();
System.out.println("The fatorial of the number " + n +" is : "+fact(n));
sc.close();
    }
   
}
