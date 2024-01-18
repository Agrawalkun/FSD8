package Memory_Management.Conditional_operator_practice;

public class Question_1_18 {
    public static void main(String[] args) {
        int x = 7;
        int y = 0;
        if (x == y) {
            System.out.println("0");
            if (y == x) {
                if (y != 0) {
                    if (x != 0) {
                        if (y == x) {
                            if (x == 89) {
                                System.out.println("kya hua tera wada");
                            } else if (y == 45) {
                                System.out.println("wo kasam wo irada");
                            }

                        }
                        System.out.println("bhoolega dil , jis din tumhe  ");
                    }
                }
                System.out.println("wo din , jindagi ka aakhiri din hoga ");
                if (x != y) {
                    System.out.println(y);
                } else if (y != 0) {
                    System.out.println(x);
                }
            } else if (x >= y) {
                System.out.println(y);
            }
            System.out.println(x);
        } else if (x < y) {
            System.out.println(y);
        }
    }
}
