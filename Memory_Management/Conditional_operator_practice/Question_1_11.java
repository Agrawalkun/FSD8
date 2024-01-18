package Memory_Management.Conditional_operator_practice;

public class Question_1_11 {
    public static void main(String[] args) {
        int x = 3;
        int y = x;
        if (x == y) {
            if (y != 0) {
                System.out.println(0);

            } else if (x <= 3) {
                System.out.println(x);
            } else if (x >= y) {
                System.out.println(y);
            } else if (x == 3) {
                System.out.println(3);
                if (y == 3) {
                    System.out.println(3);
                } else if (y == x) {
                    System.out.println(y);
                } else if (y != 0) {
                    System.out.println(0);
                } else if (x != 0) {
                    System.out.println(x);
                }
            }
            if (x <= y) {
                System.out.println(y);
            }
        }
    }
}