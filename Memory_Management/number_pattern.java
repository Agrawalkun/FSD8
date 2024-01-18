package Memory_Management;

public class number_pattern {
    public static void main(String[] args) {
        // int n =5;
        // for(int i =1;i<=n;i++){
        //     for(int j =0;j<i ; j++){
        //         System.out.print(i +" ");
        //     }
        //     System.out.println();
        // }

        int n =5;
        for(int i =1 , k=1;i<=n;i++, k++){ // for loop me initialization and updation dono kr skte h ek se jada baar
            for(int j =0;j<i ; j++){
                System.out.print(k +" ");
            }
            System.out.println();
        }
    }
     
}
