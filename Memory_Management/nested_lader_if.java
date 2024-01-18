package Memory_Management;

public class nested_lader_if {
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

            }
            if (h < j) {
                System.out.println("ye to print hona hi tha ");

            } else if (j == k) {
                System.out.println("yr ye ku print nhi hua");

            }
        } else if (k < h) {
            System.out.println("yrr ye bhi print nhi hua");

        }
        System.out.println("yess finally khatam hua");
    }
}
