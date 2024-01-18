package Memory_Management.Conditional_operator_practice;
// A shop will give discount of 10% if the cost of purchased quantity is more than 1000.

// Ask user for quantity
// Suppose, one unit will cost 100.
// Judge and print total cost for user.

public class Question_3_69 {
    public static void main(String[] args) {
        int x = 1100;
        int y = 100;
        int t = (x * y);

        if (t > 1000) {
            double k = ((10%100) * t);
            System.out.println("discount :" + k + "  total cost: " + (t - k));
        } else {
            System.out.println(y);
        }
    }
}
