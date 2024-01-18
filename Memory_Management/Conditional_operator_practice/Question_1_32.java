package Memory_Management.Conditional_operator_practice;

public class Question_1_32 {
    public static void main(String[] args) {
        int x = 87;
        int y = 34;
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
                    } else if (x >= y) {
                        System.out.println(y);
                    }
                    System.out.println(x);
                } else if (x < y) {
                    System.out.println(y);
                } else if (y < x) {
                    if (x == y) {
                        if (x >= 0) {
                            if (y <= 0) {
                                if (y == 45) {
                                    System.out.println("kya majbooriyan ");
                                }
                            }
                        }
                    }
                }
            }
        } else if (x > 60) {
            System.out.println(67);
        }
    }
}
