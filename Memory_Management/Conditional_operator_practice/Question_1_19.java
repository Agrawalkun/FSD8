package Memory_Management.Conditional_operator_practice;

public class Question_1_19 {
 public static void main(String[] args) {
    int x = 70;
    int y = 76;
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
                        System.out.println("kaisi teri khud marji");
                    }
                }
                else if (x > 63) {
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
        System.out.println("na dhoop chune na chhao");
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
