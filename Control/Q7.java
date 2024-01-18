public class Q7 {
    // Write a program to check whether a character is alphabet or not
    public static void main(String[] args) {
        char ch = 1;
        if(ch>='a'&& ch<='z' || ch>='A'&& ch<='Z'){
            System.out.println("charcter is alphabet");
        }else if (ch==0){
            System.out.println(" it is nothing");
        } else{
            System.out.println(" it is not a alphabet");
        }
    }
}
