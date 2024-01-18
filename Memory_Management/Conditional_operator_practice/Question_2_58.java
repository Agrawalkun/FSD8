package Memory_Management.Conditional_operator_practice;

public class Question_2_58 {
    public static void main(String[] args) {
        int x = 65;
        byte y = 0;
        if (x > y && y >= 0 || x == 0 && y != 65) {
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
            } else if (x > 63 || y > 64 || x < 56) {
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
        if (y != 0 || y > x && x < y || x == 65) {
            if (x != 0) {
                if (y == x && x != 54 && x > y || y != 0) {
                    if (x == 89) {
                        System.out.println("kya se kya ho gye");
                    } else if (y == 45) {
                        System.out.println("dekhte dekhte");
                    } else if (x <= 0) {
                        if (y > x) {
                            System.out.println(0);
                        } else if (y < x || y > x && x < y || x == 65) {
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
                System.out.println("jeene marne ki hm the wjh aur hmi , bewajah ho gye dekhte dekhte ");
            }
        }
    }
}
