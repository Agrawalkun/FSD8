package Memory_Management.Conditional_operator_practice;

public class Question_1_15 {
    public static void main(String[] args) {
        int x = 6;
        int y = 7;
        if (y == 0) {
            System.out.println(x);
            if (y > x) {
                System.out.println(y);
            } else if (x < y) {
                System.out.println(x);
            }
        }
        if (x == y) {
            if (y != 0) {
                System.out.println(x);
            } else if (x != 0) {
                System.out.println(y);
            }
        } else if (x > 2) {
            if (y < 8) {
                System.out.println(x);
            } else if (x >= 34) {
                System.out.println(y);
            }
        } else if (y < x) {
            if (x == y) {
                if (x >= 0) {
                    if (y <= 0) {
                        if (y == 45) {
                            System.out.println("Agar tum ho oooooa ");
                        }
                    }
                }
                System.out.println("Agar tum saath ho");
            }
        }
    }
}
