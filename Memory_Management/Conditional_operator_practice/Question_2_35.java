package Memory_Management.Conditional_operator_practice;

public class Question_2_35 {
    public static void main(String[] args) {
        int x = 'k';
        byte y = 76;
        if (x > y && x != 0) {
            System.out.println(x);
        }
        if (y < x || y == 76) {
            System.out.println(y);
        } else if (x != 0) {
            System.out.println("okkey");
        }
        if (y != 0 && y < x) {
            System.out.println("yaay");
        }
    }
}
