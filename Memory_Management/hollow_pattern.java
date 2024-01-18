package Memory_Management;

public class hollow_pattern {
    public static void main(String[] args) {
        int n =6;
        for(int i = 0; i<n;i++){
            for(int j = 0; j<n-1;j++){
                if(i==0||j==0|| i==n-1||j==n-2){
                    System.out.print( "* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
