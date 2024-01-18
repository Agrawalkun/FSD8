public class Q2 {
    // Write a program to find maximum between three numbers
    public static void main(String[] args) {
        int a = 76;
        int b = 75;
        int c = 87;
        if(a>b && a>c){
            System.out.println(a + " a is greater");
        } else if ( b>c ){
            System.out.println(b +" b is greater");
        } else {
            System.out.println(c +" c is greater");
        }
    }
}
