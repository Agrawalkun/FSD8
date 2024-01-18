package Memory_Management;
import java.util.Scanner;
public class trapezium {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 0;i<=n;i++){
        for(int k=2*i;k<2*n;k++){
            System.out.print(" ");
        }
        for(int j=0;j<2*i;j++){
                System.out.print("* ");
          
        }
        

        System.out.println();
    }
   sc.close();
}
}
