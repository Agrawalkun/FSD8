package Memory_Management.Conditional_operator_practice;

public class Question_1_3 {
    public static void main(String[] args) {
        int x = 12;
        int y = 76;
        if (x != y) {
            System.out.println("the value of x is " + x);
            if (x > y) {
                System.out.println("the value of y is" + y);
            } else if (x < y) {
                System.out.println("value is:" + x);
            }
        }
    }
}
