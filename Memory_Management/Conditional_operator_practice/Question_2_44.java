package Memory_Management.Conditional_operator_practice;

public class Question_2_44 {
    public static void main(String[] args) {
        int x = 76;
        int y = 54;
        if (x == y || x <= 4 && y != 0) {
            if (y != 0) {
                System.out.println(0);

            } else if (x <= 3 && y >= 54 || x == 0 && y != 76) {
                System.out.println(x);
            } else if (x >= y) {
                System.out.println(y);
            } else if (x == 3) {
                System.out.println(3);
                if (y == 3 || y > x || x <= 76) {
                    System.out.println(3);
                } else if (y == x) {
                    System.out.println(y);
                } else if (y != 0) {
                    System.out.println(0);
                } else if (x != 0) {
                    System.out.println(x);
                }
            }
            if (x <= y && y == x || x >= y) {
                System.out.println(y);
            }
        }
    }
}
