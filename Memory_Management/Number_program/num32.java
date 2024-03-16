package Memory_Management.Number_program;
import java.util.Scanner;

//		WAP to print Fibonacci series up-to nth term without recursion
public class num32 {
    static void fabonacci(int n){
        int c;
int a = 0;
System.out.println(a);
int b = 1;
System.out.println(b);
for(int i =3;i<=n;i++){
c = a+b;
System.out.println(c);
a=b;
b=c;

}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n = sc.nextInt();
        fabonacci(n);

        sc.close();
    }
}
