package Memory_Management.Number_program;
import java.util.Scanner;
//	WAP to find sum of all prime numbers between two given range
public class num27 {
   static boolean primeNum(int n){
int count =0;
if(n<2){
    return false;
}
for(int i=2;i<n;i++){
if(n%i==0){
    count =1;
}


}
if(count ==0){
    return true;
}
return false;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n and m : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        // primeNum(n);
        int sum =0;
        for(int i =n;i<=m;i++){
            if(primeNum(i)){
                sum = sum+i;
            }
        }
        System.out.println( " the sum of prime no. in the given range " +n +" and "+m+" is: "+sum);
        sc.close();

    }
}
