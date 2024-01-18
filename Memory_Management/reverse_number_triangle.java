package Memory_Management;

public class reverse_number_triangle {
    public static void main(String[] args) {
        int n =5;
        for(int i =0,k=n; i<n;i++,k--){
for(int j =0;j<i;j++){
    System.out.print("  ");
}
for(int h =i;h<n;h++){
    System.out.print(k+" ");
}
for(int h =i+1;h<n;h++){
    System.out.print(k+" ");
}

            System.out.println();
        }
    }
}
