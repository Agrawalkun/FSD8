package Memory_Management.Conditional_operator_practice;

public class Question_2_39 {
    public static void main(String[] args) {

        int x = 65;
        int y = 57;
        if (x == 67 && y != 0 && x > 65) {
            if (y <= 90) {
                System.out.println(90);
            } else if (x >= 67) {
                System.out.println(67);
            }
            if (y == 0 || x != 0 && y > 55) {
                System.out.println(0);
            } else if (x != 0) {
                System.out.println("x:" + x);
            }
        }
    }
}