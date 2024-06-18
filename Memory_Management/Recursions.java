package Memory_Management;
import java.util.Scanner;
public class Recursions {
    static int sum(int n){
            if(n==1){
return 1;
            }
            else{
                return ((n+1)-(n-sum(n-1)));
            }
        }
       

       
        // System.out.println("hello");
        // message1();
    
    // static void message1(){
    //     System.out.println("hello");
    //     message2();
    // }
    // static void message2(){
    //     System.out.println("hello");
    //     message3();
    // }
    // static void message3(){
    //     System.out.println("hello");
    //     message4();
    // }
    // static void message4(){
    //     System.out.println("hello");
       
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int res = sum(n);
       System.out.println(res);
    }
    
}
