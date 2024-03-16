package Memory_Management.Number_program;
import java.util.Scanner;

//	33.	WAP to print Fibonacci series up-to nth term using recursion
public class num33 {
    static int  fabonacci(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        return fabonacci(n-1)+fabonacci(n-2);
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n = sc.nextInt();
       
for(int i =0;i<n;i++){
int res = fabonacci(i);
System.out.println(res);
}
        sc.close();
    }
}
