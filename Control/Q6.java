public class Q6 {
    // Write a program to check whether a year is leap year or not
    public static void main(String[] args) {
        int x = 2100;
        if ((x % 4) == 0 && (x % 100) != 0) {
            System.out.println(x + " the yesr is a leap year");
        } else if ((x % 400) == 0) {
            System.out.println(x + " the year is a leap year");
        } else {
            System.out.println(x + " the is not a leap year");
        }
    }
}