package Memory_Management.Number_program;
import java.util.*;
//	WAP to check a number is Peterson number or not
//Peterson number are those no. if the sum of the factorials of each digit of the number is equal to the number itself.
// example 145 = 1! + 4!+5! = 1+24+120 = 145;
public class num47 {

    static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        else
        return n*fact(n-1);
    }
    static boolean peterson(int n){
        int fact =0 ;
         int num = n;
         int rem =0;
        if(n==0){
            return false;
        }
        else{
            for(int i =0;i<=n;i++){
                 rem  =  n%10;
             
                // System.out.println(rem);
                fact = fact + fact(rem);
                // System.out.println(fact(rem));
                n = n/10;
                // System.out.println(fact); 
            }
            System.out.println(n);
            if(n>0){
            fact = fact(n)+fact;
            // System.out.println(fact);
            }
            else{ 
           System.out.println(fact);
            }
         
        }
        if(fact == num){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
 if( peterson(n)){
    System.out.println(n+ " is an peterson number");
 }else{
    System.out.println(n+ " is not an  peterson number");
 }  
        sc.close();
    }
}
