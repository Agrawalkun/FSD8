package Memory_Management;
import java.util.Scanner;
// recursion : fuction calling itself
// but if we do not put any condition in it then it will go infinite loop
// to over comre through tihs we put the base condition to overcome from with this
// return kr denge kuch valuoe ko . isme koi loop, continue,break condition nhi lagegi if we use it then it is not the concept of recursion
// only if else conditon will write
// recursion ulta chlta h means ydi apn ko 10 natural no. chaiye h to wo 10 se chalu hoke 1 tak jayega 
// recursion ko real life me use nhi krta because iska khudka stAck hota h jo function ko baar baar call krne par iska stack overflow ho jayega aur space bhrne ke karan time compexitiy bhi bad jayegi
// base condition like 
// if(n==1){
//     return 1;
// }


// factorial program
public class recursion {
    static int fact (int n){
        if (n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc . nextInt();
        int res = fact(n);
        System.out.println(res);
        sc.close();
    }
    // in this program we get the value up to n = 31 becuse of its return type range 
    // when n = 32 and 33 it will give the value in the neg value because it exceed the limit of the return type 
    // after n=33 it will give the value 0 , because now we surpraas the limit
    // so just change the return type
  
}
