package Memory_Management;

public class pnumber_traingle {
    public static void main(String[] args) {
        int n =5;
        for(int i =0, k=0; i<=n;i++, k++){
            for (int j =i; j<=n ;j++){
                System.out.print("  ");
            }
            for(int h = 0; h<i ;h++){
                System.out.print(k+" "  );
            }
            for(int f =1; f<i ;f++){
                 System.out.print(k +" " );
            }
            System.out.println();
        }
    }
}
