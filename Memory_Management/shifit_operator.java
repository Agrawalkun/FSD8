package Memory_Management;

public class shifit_operator {
    public static void main(String[] args) {
        int x = -2;
        System.out.println(x << 0); // x is shifted by 1 bit towards left side
        System.out.println(x << 1); // output 4
        System.out.println(x << 2); // output 8 // we get 2^n * x; as a general formula
        System.out.println(x << 10); // output 8 // we get 2^n * x; as a general formula
        // shift operator is aplicable for only integer type data type only it is not
        // aplicable for double and float
        int y = 0b10000000000000000000000000000000;
        int e = 0b01000000000000000000000000000000;
        int r = 0b00000000000000000000000000000001;
        System.out.println(y);
        System.out.println(y << 1);
        System.out.println(y << 32);
        System.out.println(y << 33);
        System.out.println(e << 1);
        System.out.println(r << 1);
        int t = 2;
        System.out.println(t >> 0);
        System.out.println(t >> 1);
        System.out.println(t >> 2);
        System.out.println(t >> 3);
        System.out.println(t >> 4);
    }
}
