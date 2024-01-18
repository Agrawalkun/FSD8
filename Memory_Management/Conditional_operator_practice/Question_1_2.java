package Memory_Management.Conditional_operator_practice;

public class Question_1_2 {
    public static void main(String[] args) {
        int x = 87;
        int y = 45;
        if (x > y) {
            System.out.println(x);
        }
        if (y < x) {
            System.out.println(y);
        } else if (x != 0) {
            System.out.println("okkey");
        }
        if (y != 0) {
            System.out.println("yaay");
        }
    }
}
