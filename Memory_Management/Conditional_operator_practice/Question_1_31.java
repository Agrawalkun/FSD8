package Memory_Management.Conditional_operator_practice;

public class Question_1_31 {
    public static void main(String[] args) {
        int x = 65;
        byte y = 0;
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
        if (y != 0) {
            if (x != 0) {
                if (y == x) {
                    if (x == 89) {
                        System.out.println("toba magar mil gyi tujse magar");
                    } else if (y == 45) {
                        System.out.println("ho gya mai besabar");
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
                System.out.println("smbhalo mujhko oo mere yaaro smbhalna mushkil ho gya ");
            }
        }
    }
}
