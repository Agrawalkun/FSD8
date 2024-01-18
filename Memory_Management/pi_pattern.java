package Memory_Management;

public class pi_pattern {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i <n ;i ++){ 
            for (int j = 0; j < n; j++) {
                // if (n % 2 != 0) {
                    if (i == 0 || j == 1 || j == n-2 || i==n-1 && j==n-1|| i==n-2 && j==n-1) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                // } else {
                //     if (i == 1 || j == n / 2 || j == n-2) {
                //         System.out.print(" * ");
                //     } else {
                //         System.out.print(" ");
                //     }

                // }
            }
            System.out.println();
        }
    }
}
