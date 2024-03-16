package Memory_Management.Number_program;
import java.util.Scanner;
//	WAP to find gcd/hcf of  given numbers  without recursion
public class num35 {
    static int gcd(int div,int divi){
        int rem = divi%div;
if(div==0  ){
    return 0;
}
if(div>divi){
    return 1;
}
  else      
if(rem!=0 && div<=divi ){
    for(int i =0;i<div;i++){
divi = div;
div =rem;

}
}
    return div;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n and m : ");
        int div = sc.nextInt();
        int divi = sc.nextInt();
            System.out.println(gcd(div,divi));
        sc.close();
    }
}
