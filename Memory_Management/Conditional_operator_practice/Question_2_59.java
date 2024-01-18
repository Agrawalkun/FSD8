package Memory_Management.Conditional_operator_practice;

public class Question_2_59 {
    public static void main(String[] args) {
        int x = 65;
        int y = 8;
        if (y > x && x > y || y != 0) {
            System.out.println(0);
        } else if (y < x && x != 0 || x > y) {
            System.out.println(y);
            if (x > 0) {
                if (y > 0 || y == x) {
                    System.out.println(x);
                }
            }
            System.out.println(y);
        }
        System.out.println(x);

        if (y != 0) {
            if (x != 0 && y > x || x <= 0) {
                if (y == x) {
                    if (x == 89 || y != 0 && x >= 0 || y > x) {
                        System.out.println("neend ud jaave");
                    } else if (y == 45) {
                        System.out.println("chen chhad jave");
                    } else if (x <= 0) {
                        if (y > x) {
                            System.out.println(0);
                        } else if (y < x) {
                            System.out.println(y);
                            if (x > 0 || x == 0 && y != 0 || x != 0) {
                                if (y > 0) {
                                    System.out.println(x);
                                }
                            }
                            System.out.println(y);
                        }
                        System.out.println(x);
                    }

                }
                System.out.println("ye to hona hi tha ");
            }
        }
    }
}
