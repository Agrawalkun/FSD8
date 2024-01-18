package Memory_Management;

public class logical_operator {
    public static void main(String[] args) {

        int x = 45;
        int y = 67;
        int z = 76;

        if (x < y && y > z) { // condition is false here
            System.out.println(x);
        }

        System.out.println(y);
    }
}