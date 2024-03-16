package Memory_Management.pattern_question;

import java.util.Scanner;

/*
  		A
        ABA
        ABCBA
        ABCDCBA
        ABCDEDCBA



 */
public class Ques56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // char n = sc.next().charAt(0);
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j <= 2*i; j++) {
if(j>=i+1){
    System.out.print( (char)('A'+2*i-j));

} else{
    System.out.print( (char)('A'+j));
}
            }

            System.out.println();

        }
        sc.close();
    }
}
