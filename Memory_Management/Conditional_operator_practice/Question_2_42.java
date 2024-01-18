package Memory_Management.Conditional_operator_practice;

public class Question_2_42 {
    public static void main(String[] args) {
        int x = 87;
        int y = 34;
        if (x <= 0 || x != 0) {
            System.out.println(0);
            if (y > 0 && x > y) {
                System.out.println(x);
                if (x == 0) {
                    System.out.println(y);
                }
                System.out.println(y);

            } else if (x <= 0 || y > x && x > y) {
                if (y > x && x != 0 && y <= 0 || x == 87) {
                    System.out.println(0);
                } else if (y < x) {
                    System.out.println(y);
                    if (x > 0) {
                        if (y > 0) {
                            System.out.println(x);
                        }
                    }
                    System.out.println(y);
                }
                System.out.println(x);
            }
        }
    }
}
