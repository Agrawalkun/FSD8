package Memory_Management;
import java.util.*;
 interface calculations {

  public abstract int add( int a, int b );
  public abstract int sub(int a, int b);
  public abstract int mul(int a, int b);
  public abstract int div(int a, int b);
 }

class  calculate implements calculations{
 public int add(int a, int b){
    int sum = a+b;
    return sum;
// System.out.println(" this is the addition " + (a+b));
}
 public int sub(int a, int b){
    int substraction = a-b;
    return  substraction;
    // System.out.println(" this is the substraction "+ (a-b));
}
 public int mul(int a, int b){
    int multiplication = a*b;
    return  multiplication;
    // System.out.println(" this is the multiplication "+(a*b));
}
 public int div(int a, int b){
    int division = a/b;
    return  division;
    // System.out.println(" this is the division "+(a/b));
}

}

public class calculator_interface {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of a");
int a = sc.nextInt();
System.out.println("Enter the value of b");
int b = sc.nextInt();
System.out.println("Enter the operation");
char ch = sc.next().charAt(0);
calculate calc = new calculate();
switch (ch) {
    case '+':
    System.out.println(" this is the addition "+  calc.add(a,b));
        break;
    case '-':
    System.out.println(" this is the substraction "+  calc.sub(a,b));
        break;
    case '*':
    System.out.println(" this is the multilication "+  calc.mul(a,b));
        break;
    case '/':
    System.out.println(" this is the division "+  calc.div(a,b));
        break;

    default:
    System.out.println("aenter the valid number");
        break;
}
        // calc.add(a,b);
        // calc.sub(a,b);
        // calc.mul(a,b);
        // calc.div(a,b);
        sc.close();
    }
}
