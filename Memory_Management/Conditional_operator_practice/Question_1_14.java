package Memory_Management.Conditional_operator_practice;

public class Question_1_14 {
    public static void main(String[] args) {
        int x = 23;
        int y = 45;
        if (x <= 0) {
            System.out.println(0);
            if (y > 0) {
                System.out.println(x);
                if (x == 0) {
                    System.out.println(y);
                }
                System.out.println(y);

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
         else if (x <= 64) {
            System.out.println("pal bhar me  kaise badalte hain rishte ");
        }
        System.out.println("ab to har apna begana lgta hai");
    }
    }

