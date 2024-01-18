package Memory_Management.Conditional_operator_practice;

public class Question_1_7 {
    public static void main(String[] args) {
        int x = 34;
        int y = 54;
        if (x > 0) {
            if (y >= 100) {
                if (x != y) {
                    System.out.println(34);
                } else if (y == 54) {
                    System.out.println(54);
                }

            } else if (x != 54) {
                if (y == 0) {
                    System.out.println(y);
                } else if (x > y) {
                    if (x < y) {
                        System.out.println(x);
                        if (y != 0) {
                            System.out.println(y);

                        } else if (y == 43) {
                            System.out.println(67);
                        }
                    } else if (x == y) {
                        System.out.println(x + y);
                    }
                }
            }
            System.out.println(y);
        }
        System.out.println(y + 0);
    }
}
