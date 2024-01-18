package Memory_Management.Conditional_operator_practice;

public class Question_3_94 {
    public static void main(String[] args) {
        int a = 87;
        int h = 5;
        int y = 75;
        if (y == 78) {
            System.out.println("jdh");
            if (a > h) {
                System.out.println("ty");
            } else if (y == h) {
                System.out.println("qyet");
            } else if (a != h) {
                System.out.println("try");
            }
            if (a < h) {
                System.out.println("plus");
            }
            if (a > h || 7 > a) {
                System.out.println(a);
            }
        } else if (true) {
            if (y > h || h > a) {
                System.out.println(y);
            }
            if (h < y && a > h) {
                System.out.println("tyw");
            } else if (h > y) {
                System.out.println(h);
            }
        }
    }

}
