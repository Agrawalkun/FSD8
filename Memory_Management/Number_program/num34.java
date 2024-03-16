package Memory_Management.Number_program;
import java.util.Scanner;
//	WAP to print Fibonacci series starting with 2 and 5 up-to nth term using recursion
public class num34 {
    static int fabo(int n){
// if(n<2){
//     return 0;
// }
// else
if(n==0){
    return 2;
}
else
if(n==1){
    return 5;
}
return fabo(n-1)+fabo(n-2);

       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.println("the fabonacci series start with 2 and 5 is: ");
        for(int i =0;i<n;i++){
            System.out.println(fabo(i));
        }
   
        sc.close();
    }
}
