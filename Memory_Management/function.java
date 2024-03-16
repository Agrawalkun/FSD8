package Memory_Management;
import java.util.Scanner;
// 1.	Without parameter without return value
// 2.	Without parameter with return value
// 3.	With parameter without return value
// 4.	With parameter with return value
// We must master 4rth type at least master two type
// Syntax :-
// Access_modifier  static returntype method_name (parameter)
// {
// Statement;
// Return value;//based on return value
// }


// difference between function and method
// Method: method are those which is created by ythe user according to the conditon given like given inthe below program
// Function: funtion are those method which present in the inbuilt libraries like power function
// with parameter without return type
public class function {

    static void add(int a,int b){
        int c = a+b;
        System.out.println(c);
      
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc . nextInt();
        int b = sc . nextInt();
        add(b,a);
        sc.close();
    }
 
}
