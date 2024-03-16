package Memory_Management.Number_program;
import java.util.Scanner;
//		WAP to check a number is palindrome or not
public class num18 {
    static int palindrome(int n){
      int rev = 0;
      int rem = 0;
      for(int i =0;i<n;i++){
 rem = n%10;
n = n/10;
rev = rev*10+rem;

      }
      rev = rev*10+n;
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n = sc.nextInt();
       int res =  palindrome(n);
       if(res!=n){
        System.out.println(res +" is  not a palindrome no.");
    }
    else{
     System.out.println(res + " is a palindrome no.");
    }
        sc.close();
    }
}
