package Memory_Management.Conditional_operator_practice;

public class question_1 {
    public static void main(String[] args) {
        int x = 12;
        int y = 89;
        if (true) {
            System.out.println(x);
        }
        if (false) {
            System.out.println(y);
        } else if (true) {

            System.out.println(x);
        }
    }

}
