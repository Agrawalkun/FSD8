package Memory_Management.Conditional_operator_practice;

public class Question_1_20 {
    public static void main(String[] args) {
        int x = 12;
        int y = 43;
        if (x == y) {
            if (y != 0) {
                System.out.println(0);

            } else if (x <= 3) {
                System.out.println(x);
            } else if (x >= y) {
                System.out.println(y);
            } else if (x == 3) {
                System.out.println(3);
                if (y == 3) {
                    System.out.println(3);
                } else if (y != 0) {
                    System.out.println(0);
                } else if (x != 0) {
                    System.out.println(x);
                }
            }
            if (x <= y) {
                System.out.println(y);
            }
        }
        if (x < y) {
            if (x != 0) {
                if (y > x) {
                    if (y != 0) {
                        if (x == 6) {
                            System.out.println(6);
                        }
                    }
                } else if (y == 78) {
                    System.out.println("itti si hasi, itti si khushi ");
                }
            }
        }
    }
}
