package Memory_Management.Conditional_operator_practice;

public class Question_2_62 {
    public static void main(String[] args) {
        int y = 45;
        int x = 89;
        if (x != 0 || y != 0) {
            if (x > y && y < x || x == y && x >= y) {
                if (x > 0 || y != 0 || x != 0 && y > x) {
                    if (y < 4) {
                        if (x != y && x == y) {
                            if (x == 65 || x > y) {
                                System.out.println(x);
                            }
                            System.out.println(y);
                        }
                        System.out.println(y);
                    }
                }
            } else if (x > 60 && x != 0) {
                System.out.println(67);
            }
        } else if (y < x) {
            if (x == y) {
                if (x >= 0) {
                    if (y <= 0) {
                        if (y == 45) {
                            System.out.println("tere pyaar ko me baar baar khat likh rha");
                        }
                    } else if (x > 63 && y < x || y != 0) {
                        if (x != 0) {
                            if (x > y) {
                                if (x > 0) {
                                    if (y < 4) {
                                        if (x != y) {
                                            if (x == 65 || y == 0 && x != 0) {
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
        }
    }
}
