package Memory_Management;

public class mirror_image_right_triangle {
    public static void main(String[] args) {
        int n =7;
        for( int i =0; i<=n;i++){
            for(int j = i ; j<n;j++){
                System.out.print( "  ");
            }
            for(int k = 1 ; k<=i ; k++){
System.out.print("* ");
            }
            System.out.println();
            
        }
    }
}
