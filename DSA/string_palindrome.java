package DSA;
import java.util.*;
public class string_palindrome {
    public static boolean check(String n){
        int i = 0,j = n.length()-1;
while(i<j){
    if(n.charAt(i)!=n.charAt(j)){
        return false;
    }
    i++;
    j--;
}
return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your string");
        String n = sc.next();
        System.out.println(check(n));

//         for(int i = 0;i<n.length();i++){
// for(int j = n.length()-1;j>=0;j--){
//     if(n.charAt(j)== n.chartAt(i)){
//         continue;
//     }
    
// }

//         }
//         System.out.println("string is palindrome");
sc.close();
    }

}
