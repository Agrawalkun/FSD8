package DSA;
import java.util.*;


public class prime_number {
    public static boolean isprime(int n){
        if(n ==0|| n==1) return false;
        for(int i =2;i<n;i++){
            if(n%i==0)
             return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            if(isprime(i)){
                System.out.println(i);
            };
        
    }
   
        // if(i==0|| i==1) break;
        // if(n%i!=0){
        //     System.out.println(i);
        // }


    }
}
