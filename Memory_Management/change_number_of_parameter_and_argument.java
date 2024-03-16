package Memory_Management;
// with parameter with return type
import java.util.Scanner;
public class change_number_of_parameter_and_argument {
    static int add(int a,int b,int c ){
        int d = a+b+c;
        // System.out.println(c);
        return d;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc . nextInt();
        int b = sc . nextInt();
        int c = sc . nextInt();
       int res =  add(b,a,c);
       System.out.println(res);
        sc.close();
    }
}
