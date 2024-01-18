 import java.lang.Math;
 public class Q17 {
   
    //Write a program to find all roots of a quadratic equation
    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        double c = 1;
double D = Math.sqrt(Math.pow(b,2) -(4*a*c));
if(D>0){
    System.out.println( "two real roots");
}
if(D==0){
    System.out.println( "two equal and real roots");
}
if(D<0){
    System.out.println( "two imaginary roots");
}
double x1 = (-b + D)/(2*a);
double x2 = (-b - D)/(2*a);
System.out.println(x1 + " ," + x2);

    }

}
