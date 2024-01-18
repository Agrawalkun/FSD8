package Memory_Management.Conditional_operator_practice;

public class Question_2_38 {
    public static void main(String[] args) {
        int x = 97;
        byte y = 'n';
        if (y == 0 && x >= y || y == 'n') {
            System.out.println(x);
            if (y > x) {
                System.out.println(y);
            } else if (x < y) {
                System.out.println(x);
            }
        }
        if (x == y) {
            if (y != 0 || x != 0) {
                System.out.println(x);
            } else if (x != 0) {
                System.out.println(y);
            }
        } else if (x > 2) {
            if (y < 8 && x >= 97) {
                System.out.println(x);
            } else if (x >= 34) {
                System.out.println(y);
            }
        }
        System.out.println("yupp");
    }
}
