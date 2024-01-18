package Memory_Management;
/* 1
   12
   123
   1234
 */

public class different_number_print_right_triangle {
    public static void main(String[] args) {
        int n = 3;
        for(int i =0;i<n;i++){
            for(int j =0;j<=i;j++){
                System.out.print(j+1 +" ");
            }
            System.out.println();
        }
    }
}
