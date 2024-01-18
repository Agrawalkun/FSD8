public class Q9 {
    // Write a program to input any character and check whether it is alphabet,
    // digit or special
    // character
   
    public static void main(String[] args) {
        char ch = 9;
        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is alphabet");
        } else if (ch >= 0 && ch <= 9) {
            System.out.println((int)ch+ " is digit");
        } else {
            System.out.println(ch + " is a special character");
        }
    }
}
