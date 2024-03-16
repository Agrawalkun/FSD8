public class Q28 {
    // A five-digit number is entered through the keyboard. Write a program to
    // obtain the
    // reversed number and to determine whether the original and reversed numbers
    // are equal
    // or not
    static int reverse_number;
    static int quotient;

    public static void main(String[] args) {
        int number = 223678;
        int num = number;
        reverse_number = 0;
        for (int i = 0; i <=number; i++) {
            int rem = number % 10;
            reverse_number = reverse_number * 10 + rem;
            number = number / 10;
        }

        System.out.println(number);
        reverse_number = reverse_number * 10 +number;
        System.out.println(reverse_number);
        if (reverse_number == num) {
            System.out.println(num + " equal to reverse number");
        } else if (reverse_number != num) {
            System.out.println(num + " not equal to reverse number");
        }

    }
}
