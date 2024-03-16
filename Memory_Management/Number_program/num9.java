package Memory_Management.Number_program;

import java.util.Scanner;

//		WAP to find sum of all natural numbers up-to nth using recursion
public class num9 {
   static int sum(int n) {
// int sum = 0;
if(n==1){
  return 1;
} else if(n==0){
  return 0;
}
else{
  return n+sum(n-1);
}

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n : ");
        int n = sc.nextInt();
          // sum(n);
System.out.println(sum(n));
        sc.close();
    }
}
