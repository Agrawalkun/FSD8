package Memory_Management.Conditional_operator_practice;

public class Question_2_37 {
    public static void main(String[] args) {
        int x = 76;
        int y = 43;
        if (x == y) {
            System.out.println(x);
            if (x < y && y == 0) {
                System.out.println(y);
            } else if (y > x) {
                System.out.println(x);
            }
        }
        if (x == 23) {
            System.out.println(23);
            if (y != 0) {
                System.out.println(13);

            } else if (x > y || x != 76 && y == 43) {
                System.out.println("answer is correct");
            }
        }

    }
}
