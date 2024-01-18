package Memory_Management;
/*1
  21
  321
  4321
 */
public class decreasing_number_right_traingle {
    public static void main(String[] args) {
        int n = 5;
        for(int i =0; i<n; i++){
            for(int j =0; j<=i;j++){
                System.out.print(i-j+1 +" ");
            }
            System.out.println();
        }
    }
}
