public class Q4 {
    // Write a program to check whether a number is divisible by 5 and 11 or not
    public static void main(String[] args) {
        int x = 65;
        if ((x % 5) == 0) {
            System.out.println("number is divisible by 5");
        } else if ((x % 11) == 0) {
            System.out.println("number is divisible by 11");
        } else {
            System.out.println("number is neither divisible by 5 nor 11 ");
        }
    }
}
