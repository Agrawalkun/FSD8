package Memory_Management.Conditional_operator_practice;

public class Question_1_6 {
    public static void main(String[] args) {
        int x = 67;
        int y = 90;
        if (x == 67) {
            if (y <= 90) {
                System.out.println(90);
            } else if (x >= 67) {
                System.out.println(67);
            }
            if (y == 0) {
                System.out.println(0);
            } else if (x != 0) {
                System.out.println("x:" + x);
            }
        }
    }
}
