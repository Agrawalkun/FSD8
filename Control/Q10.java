public class Q10 {
    // Write a program to check whether a character is uppercase or lowercase alphabet
    public static void main(String[] args) {
        char ch = 'A';
        if(ch>='a'&& ch <='z'){
System.out.println(ch + " is a lowercase alphabet");
            
        }  else if(ch>='A' && ch<='Z'){
            System.out.println(ch + " is a upercase alphabet");
        }
    }
}
