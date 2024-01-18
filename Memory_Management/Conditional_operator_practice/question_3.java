package Memory_Management.Conditional_operator_practice;

public class question_3 {
    public static void main(String[] args) {
        int r = 23;
        byte m = 24;
        if (r > m) {
            System.out.println("jaldi waha se hato");
            if (r != m) {
                System.out.println("so beautiful, so elegant");
            } else if (r < m) {
                System.out.println("just looking like a woww!");
            }
        }
        if (m != r || m > r) {
            System.out.println("nahi jagah h");
            if (r == m && m == r) {
                System.out.println("are bahut jagah hai");
            }
            if (m != 0) {
                System.out.println("mast joke mara re");
                if (r > m) {
                    System.out.println("bahut tej ho rhe ho");
                } else if (r < m) {
                    System.out.println("Shabash");
                }
            }
        } else if (r == 23) {
            System.out.println("moye moye krne se ghr nhi chalta");
            if (m == 24) {
                System.out.println("moye moye");
                if (m == r) {
                    System.out.println("0");
                } else if (m <= 0) {
                    System.out.println("1");
                }
            } else if (m >= 0) {
                System.out.println("offoo");
            }
        }

    }

}
