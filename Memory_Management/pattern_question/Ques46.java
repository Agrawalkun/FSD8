package Memory_Management.pattern_question;
import java.util.Scanner;
public class Ques46 {
     /*
     	*********
        *******
        *****
        ***
        *
        *
        ***
        *****
        *******
        *********

// pending
            */
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                 for(int i = 0 ; i<n/2;i++){
                    for(int j=2*i; j<n-1;j++){
                        System.out.print("*"); 
                    }
                    System.out.println();
                 }
                 for(int i =0;i<n/2;i++){
                    for(int j =0;j<=2*i;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                 }
                 sc.close();
                }
}
