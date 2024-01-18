package Memory_Management.Conditional_operator_practice;

public class Question_1_9 {
    public static void main(String[] args) {
        int x = 0;
        int y = x;
        if (x <= 0) {
            System.out.println(0);
            if (y > 0) {
                System.out.println(x);
                if (x == 0) {
                    System.out.println(y);
                }
                System.out.println(y);

            } else if (x <= 0) {
                if (y > x) {
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
