package Memory_Management.Conditional_operator_practice;

public class Question_2_36 {
    public static void main(String[] args) {
        int x = 54;
        int y = x;
        if (x != y || x == 54) {
            System.out.println("the value of x is " + x);
            if (x > y && x != y || x == 0) {
                System.out.println("the value of y is" + y);
            } else if (x < y || y > x || y == x) {
                System.out.println("value is:" + x);
            }
        }

    }
}
