package Memory_Management.Conditional_operator_practice;

public class Question_1_8 {
    public static void main(String[] args) {
        int x = 65;
        int y = 5;
        if (x == 65) {
            if (y != 0) {
                if (y == 5) {
                    if (x <= 0) {
                        if (y != 5) {
                            if (x != 65) {
                                System.out.println(y);
                            } else if (y < x) {
                                System.out.println(x);
                            }

                        }

                    }

                }
                System.out.println("har saas tera mukhdaaa");
            } else if (x > 63) {
                if (x != 0) {
                    if (x > y) {
                        if (x > 0) {
                            if (y < 4) {
                                if (x != y) {
                                    if (x == 65) {
                                        System.out.println(x);
                                    }
                                    System.out.println(y);
                                }
                                System.out.println(y);
                            }
                        }
                    } else if (x > 60) {
                        System.out.println(67);
                    }
                }
            }
        }
    }
}
