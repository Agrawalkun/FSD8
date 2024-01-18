package Memory_Management.Conditional_operator_practice;

public class Question_1_4 {
    public static void main(String[] args) {
        int x = 23;
        int y = 13;
        if (x == y) {
            System.out.println(x);
            if (x < y) {
                System.out.println(y);
            } else if (y > x) {
                System.out.println(x);
            }
        }
        if (x == 23) {
            System.out.println(23);
            if (y != 0) {
                System.out.println(13);

            } else if (x > y) {
                System.out.println("answer is correct");
            }
        }

    }
}
