package Memory_Management;

public class half_rohmbus_pattern {
    public static void main(String[] args) {
        int n =7;
        for(int i= 0, k=0; i<=n/2;i++,k++){
            for(int j =0;j<=i;j++){
                System.out.print(k+i+1+" ");
            }

System.out.println();
        }
        for(int i =0,k=n; i<n/2;i++,k--){
            for(int j =i;j<n/2;j++){
                System.out.print(k-i-2+" ");
            }
            System.out.println();
        }
    }
}
