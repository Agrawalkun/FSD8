package Memory_Management.Number_program;
import java.util.Scanner;
//	WAP to count the number of digits of a given number
// pending
public class num16 {
    static int count(int n){
if(n<10){
    return 1;
} else{
return 1+count(n/10);
}
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n and m : ");
        int n = sc.nextInt();
        System.out.println(count(n));
        sc.close();
}
}
