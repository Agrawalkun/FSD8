package Memory_Management;

public class hollow_right_triangle {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == n-1 || i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
