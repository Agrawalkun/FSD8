package Memory_Management.pattern_question;
import java.util.Scanner;

/*
	1
    10
    101
    1010
    10101
 */
public class Ques59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // char n = sc.next().charAt(0);
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j <= i; j++) {
                if(j%2!=0){
                    System.out.print(0);
                } else{
                    System.out.print(1);
                }
                
            }
            System.out.println();
        }
        
        sc.close();
    }
}
