package Memory_Management;

// upcasting is also know as the widining and downcasting is also known as downcasting.
// in the upcasting storing of  data of smaller  type into the bigger data type can be done automatically or implicitly  by the compiler.
// the data type must be compatible.
//in the downcasting storing of  data of bigger  type into the smaller data type can be done externally or explicitly  by the compiler.
public class Upcasting_and_Downcasting {
    public static void main(String[] args) {

        byte b =5 ;
        short s = 200;
        int i = 10;
        long l = 10;
        float f = 10f;
        double d = 10;
        char ch = 10;
        boolean bl = true;
        // b = s; // error data type is not compatible
        // widdining
        i = s;
        i = b;
        l = i;
        l = s;
        l = b;
        // ch = b; // this will give error,
        // narrowing
       // s = (short) i; // it will typecast the data type but it will loss the somewhat data during the
                       // typecasting
         b = (byte)s;
         System.out.println(b);    
         int x =12;
         float y = 13.43f;
         char dh = 'A';
         System.out.printf("hello %x  %c World  \n",x,dh);   // within the string write the format Specifier or the control Characters
         System.out.printf(" %g \n",y); 
         System.out.printf(" %5d \n",x); // this 5 is the widht means ki kitne places tak no. print hoga  
         System.out.printf(" %-5d \n",x);
    }
}
