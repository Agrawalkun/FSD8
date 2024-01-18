package Memory_Management.Conditional_operator_practice;

public class Question_1_28 {
    public static void main(String[] args) {
        int y ='h';
        int x = y;
        if (x == y) {
            System.out.println("0");
            if (y == x) {
                if (y != 0) {
                    if (x != 0) {
                        if (y == x) {
                            if (x == 89) {
                                System.out.println("asal me");
                            } else if (y == 45) {
                                System.out.println("tum nhi ho mere");
                            }

                        }
                        System.out.println("tum nhi ho mere ");
                    }
                }
                System.out.println("tum nhi ho mere ");
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
        }else if (y < x) {
            if (x == y) {
                if (x >= 0) {
                    if (y <= 0) {
                        if (y == 45) {
                            System.out.println("kya majbooriyan ");
                        }
                    }
                }
            }
            System.out.println("kaise ye dooriyan");
        }
    }
}
