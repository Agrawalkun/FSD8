package Memory_Management.Conditional_operator_practice;

public class Question_1_22 {
    public static void main(String[] args) {
        char x = 'h';
char y = 'a';

if (x == y) {
    System.out.println("0");
    if (y == x) {
        if (y != 0) {
            if (x != 0) {
                if (y == x) {
                    if (x == 89) {
                        System.out.println("mere haat me");
                    } else if (y == 45) {
                        System.out.println("tera haat ho");
                    }

                }
                else if (y < x) {
                    if (x == y) {
                        if (x >= 0) {
                            if (y <= 0) {
                                if (y == 45) {
                                    System.out.println("saari jannate ");
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
                    System.out.println("mere saath ho");
                }
                System.out.println("tu jo paas ho   ");
            }
        }
        System.out.println("fir kya ho wajah ");
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
