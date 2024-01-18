package Memory_Management.Conditional_operator_practice;

public class Question_1_30 {
    public static void main(String[] args) {
        int x = 65;
        int y = 8;
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

        if (y != 0) {
            if (x != 0) {
                if (y == x) {
                    if (x == 89) {
                        System.out.println("ye manja tera te");
                    } else if (y == 45) {
                        System.out.println("ye dil ki patang ko kaate haye");
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
                System.out.println("gire teri chhat pe aake haye ");
            }
        }
    }
}
