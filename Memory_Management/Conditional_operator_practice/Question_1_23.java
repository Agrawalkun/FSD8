package Memory_Management.Conditional_operator_practice;

public class Question_1_23 {
    public static void main(String[] args) {
        char x = 'i';
        char y = 'j';
        if (x > y) {
            System.out.println("gulabi aakhen jo teri dekhi");
            if (y < x) {
                System.out.println("sharabi ye dil ho gya");
            }
            if (y != 0) {
                if (x != 0) {
                    if (y == x) {
                        if (x == 89) {
                            System.out.println("toba magar mil gyi tujse magar");
                        } else if (y == 45) {
                            System.out.println("ho gya mai besabar");
                        }
                        else if (x <= 0) {
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
        } else if (y < x) {
            if (x == y) {
                if (x >= 0) {
                    if (y <= 0) {
                        if (y == 45) {
                            System.out.println("akhiya meri puch rhi h ");
                        }
                    }
                }
            }
            System.out.println("dil ko mere chen nhi hai");
        }
    }
}
