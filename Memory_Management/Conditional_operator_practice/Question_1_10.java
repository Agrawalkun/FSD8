package Memory_Management.Conditional_operator_practice;

public class Question_1_10 {
    public static void main(String[] args) {
        int y = 78;
        int x = 64;
        if (y > x) {
            System.out.println("is majahab ishq meri zaat bn gyi");
        }
        if (x < y) {
            if (x != 0) {
                if (y > x) {
                    if (y != 0) {
                        if (x == 6) {
                            System.out.println(6);
                        }
                    }
                } else if (y == 78) {
                    System.out.println("roye sisak sisak ke hawaye ");
                }
            }
        } else if (x <= 64) {
            System.out.println("roothi roothi sari raate ");
        }
        System.out.println("koi rahe na jab apna");
    }
}
