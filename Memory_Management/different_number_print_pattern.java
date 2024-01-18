package Memory_Management;
/*
 1
 23
 456
 78910
 */
public class different_number_print_pattern {
    public static void main(String[] args) {
        int n =4;
        int k =1;
        for(int i =0; i<n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print(k +" ");
                k++;
            }
            System.out.println();
        }
    }
}
