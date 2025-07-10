package DSA;
import java.util.*;
public class Reverse_a_string {
    // reverse a string;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc. next();
        String rev =""; // empty string
        for(int i=s.length()-1 ; i>=0;i--){
rev+=s.charAt(i);
        }
        System.out.println(rev);
    }
}
