package DSA;
import java.util.*;
public class StringBuilder1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder rev = new StringBuilder();
        rev.append(s);
        rev.reverse();
        System.out.println(rev);
    }
}
