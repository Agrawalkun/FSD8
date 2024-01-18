public class Q15 {
    // Write a program to input all sides of a triangle and check whether triangle
    // is valid or
    // not
    public static void main(String[] args) {
        int x = 65;
        int y = 67;
        int z = 0;
        if (x == 0 || y == 0 || z == 0) {
            System.out.println("Traingle is invalid");
        } else if ((x + y) > z || (y + z) > x || (x + z) > y) {
            System.out.println("Traingle is valid");
        } else {
            System.out.println("Traingle is invalid");
        }
    }
}
