package Memory_Management;

public class operator {
    public static void main(String[] args) {
        double x = 0.3;
        double y =0.7;
        byte r = 127;
        System.out.println(~r);
        System.out.println(2&3);
        System.out.println(x<y&x>y);
        System.out.println(!(x<y&x>y));
        System.out.println(!(!(x<y&x>y)));
        System.out.println(~2);
        int a = 22;
        int b =56;
        System.out.println(b);
        b+=a; // b=b+a
        a-=b;
        boolean g = b<a;
        System.out.println(b>=a);
System.out.println(b);

    }
}
