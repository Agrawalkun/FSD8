package Memory_Management.Conditional_operator_practice;

public class Question_1_17 {
    public static void main(String[] args) {
        int x = 12;
        int y = 34;
        if (x < y) {
            System.out.println(x);
        }
        if (y > x) {
            System.out.println(y);
        } else if (y < x) {
            if (x == y) {
                if (x >= 0) {
                    if (y <= 0) {
                        if (y == 45) {
                            System.out.println("yaa rabba dede koi jaan bhi agar");
                        }
                    }
                }
            }
            System.out.println("kacchi thi aas ki dori");
        } else if (x <= 0) {
            if (y > x) {
                System.out.println(0);
            } else if (y < x) {
                System.out.println(y);
                if (x > 0) {
                    if (y > 0) {
                        System.out.println(x);
                    }
                }
                System.out.println(y);
            }
            System.out.println(x);
        }
    }
}
