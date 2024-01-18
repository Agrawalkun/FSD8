package Memory_Management.Conditional_operator_practice;

public class Question_1_13 {
    public static void main(String[] args) {
        int y = 0;
        int x = 0;
        if (x == y) {
            System.out.println("0");
            if (y == x) {
                System.out.println(x);
                if (x != y) {
                    System.out.println(y);
                } else if (y != 0) {
                    System.out.println(x);
                }
            } else if (x >= y) {
                System.out.println(y);
            }
            System.out.println(x);
        } else if (x < y) {
            System.out.println(y);
        }
        System.out.println(y);
    }
}
