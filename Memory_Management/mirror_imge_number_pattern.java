package Memory_Management;
import java.util.Scanner;
public class mirror_imge_number_pattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0; i<n;i++){
System.out.println();
for(int j =0; j<i;j++){
System.out.print("  ");
}
for(int k = i;k<n ;k++){
    System.out.print(n-k+i+" ");
}
        }
        System.out.println();

    }
}
