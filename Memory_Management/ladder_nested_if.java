package Memory_Management;

public class ladder_nested_if {
    public static void main(String[] args) {
        int h = 45;
        int k = 56;
        int j = 56;
        if (h <= k) {
            System.out.println(h);
            if (k != h) {
                System.out.println("it is true");

            } else if (h == h) {
                System.out.println("woow ye bhi print ho gya");

            }
        }
        if (k == j) {
            System.out.println(j);
            if (k < j) {
                System.out.println(k);
                if (k > h) {
                    System.out.println("are waahh ye to print hona hi tha");
                    if (j != h) {
                        System.out.println("are ye bhi print ho gya woowwww");
                    } else if (h == j) {
                        System.out.println("kya ye print hoga");
                    }

                } else if (h != 0) {
                    System.out.println("iska ans to h ki value ayega");

                }
            }

            if (h < j) {
                System.out.println("ye to print hona hi tha ");

            } else if (j == k) {
                System.out.println("yr ye ku print nhi hua");

            }
        } else if (k < h) {
            System.out.println("yrr ye bhi print nhi hua");
            if (k != 0) {
                System.out.println("isko to print hona mngta h yr");
            } else if (k == k && h < k) {
                System.out.println("I don't think so ki ye print hoga");
            }

        }
        System.out.println("yess finally khatam hua");
    }
}
