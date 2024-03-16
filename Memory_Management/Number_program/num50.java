package Memory_Management.Number_program;
import java.util.*;
import java.lang.Math;
//pending
//	WAP to check a number is Fascinating number or not
// When a no.(3 digit or more that 3 digit ) is multiplied by 2 and 3 and when both these products are concatenated with the original  number. then the result in all digits from 1to 9 presents exactly once. thare could be any number of zeros  and are ignored.
public class num50 {
    static int count(int n){
        if(n==0){
            return 0;
        }
        return 1+count(n/10);
    }
    static boolean fascinating(int n){
        if(n==0){
            return false;
        }
        else{
int multipliedBy2 =( 2*n);
int multipliedBy3 = 3*n;
//  int count = count(n);
  //String s1 =String.valueOf(multipliedBy2); // it con change the string into integer
//int g = Integer.parseInt((s1)); // it can change the string into integer.
//   String s2 =String.valueOf(multipliedBy3) ;
//   String s = s1+ multipliedBy3+n;
// System.out.println(count(n));
// System.out.println(Math.pow(10,count(n)));
double num = (int)n*(Math.pow(10,count(n)));
int nums = (int)num;
System.out.println(nums +"orignal no. multiplied by the 1000");
int add =nums+multipliedBy3;
System.out.println(add +"orignal no. add with the no. multiplied by the 3");
// System.out.println(count(multipliedBy2));
// System.out.println(Math.pow(10,count( multipliedBy2)));
double num1 = Math.pow(10,count( multipliedBy2));
int nums1 = (int)num1;
// int n1 = (int)1000*add;
int add1 = add*nums1;
System.out.println(add1 +" add no. multipled by the 1000");
// double add2 =  add+(Math.pow(10,count( multipliedBy2)));
int adds1 = add1+ multipliedBy2;
System.out.println( adds1);
int counter =0;
int rem =0;
for(int i =0; i<adds1;i++){
    adds1 =adds1/10;
    rem = rem%10;
    // System.out.println(adds1);
    if(rem==0){
        continue;
    }
    System.out.println(counter +"kj");
    counter++;
    
}
counter = counter +1;
System.out.println(counter);
if(counter ==9){
    return true;
}
        }
  return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        if (fascinating(n)) {
            System.out.println(n + " is a fascinating number");
        } else {
            System.out.println(n + " is not a fascinating  number");
        }
        sc.close();
    }
}
