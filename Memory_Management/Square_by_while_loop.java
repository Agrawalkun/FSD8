package Memory_Management;

public class Square_by_while_loop {
    public static void main(String[] args) {
        int n = 5;
        int i = 0;
        while (i < n) {
            int j = 0;
            while (j <= n) {
                System.out.print("* ");
                j++;
            }
            i++;
            System.out.println();
        }

    }
}
