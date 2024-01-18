package Memory_Management.Conditional_operator_practice;

public class Question_2_43 {
    public static void main(String[] args) {
        byte x = 76;
        byte y = x;
        if (y > x || x != 0) {
            System.out.println("saiya dil me aana re");
        }
        if (x < y && x == 0) {
            if (x != 0) {
                if (y > x) {
                    if (y != 0) {
                        if (x == 6) {
                            System.out.println(6);
                        }
                    }
                } else if (y == 78 || x != 0 || x == 78 && y >= x) {
                    System.out.println("aake fir na jana re ");
                }
            }
        } else if (x <= 64 || y >= 98) {
            System.out.println("thodo thodi chhed hogi ");
        }
        System.out.println("thoda thoda pyar hoga");
    }
}
