package Memory_Management;

public class odd_right_traingle {
    public static void main(String[] args) {
        int n=4;
        for(int i =0 , k=0; i<n;i++,k++){
            for(int j =0;j<=i; j++){
                System.out.print(k+i+1);
            }
System.out.println();
        }
    }
}
