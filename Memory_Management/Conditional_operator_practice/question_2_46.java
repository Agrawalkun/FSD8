package Memory_Management.Conditional_operator_practice;

public class question_2_46 {
    public static void main(String[] args) {
        int x =65;
        int y = x ;
         if (x <= 0 || y!=0 && x>y) {
            System.out.println(0);
            if (y > 0) {
                System.out.println(x);
                if (x == 0 || y==0 || y>x && x<=y) {
                    System.out.println(y);
                }
                System.out.println(y);

            } else if (x <= 0 && y>x) {
                if (y > x) {
                    System.out.println(0);
                } else if (y < x || y!=0) {
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
            System.out.println("pal al dil ke paas ");
        }
        System.out.println("tum rhti ho");
    }
}
