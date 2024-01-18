package Memory_Management;
// ek program me jb do main honge to phle system ko batana  padega ki konsa main run karana h 

public class file2 {

    public static void main(String[] args) { // main 1
        xyz();
        file2.xyz();
        file3.pqr();
    }

    static float xyz() { // this static method is also called a class method
        System.out.println("xyz");
        return 34.5f;
    }

}

class file3 {
    public static void main(String[] args) { // main 2

        pqr();
    }

    static int pqr() {
        System.out.println("pqr");
        return 2;
    }
}
