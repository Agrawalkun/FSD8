package DSA;
import java.util.*;
public class hashtable_of_substring {
    public static Hashtable<String, Integer> getSubstringsHashtable(String str) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        int length = str.length();
        // int [] hashtable = new int[26];

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                String substring = str.substring(i, j);
                // hashtable[substring.charAt(i)-'a']++;
                hashtable.put(substring, i);
            }
        }

        return hashtable;
    }
    public static void main(String[] args) {
        String input = "example";
        Hashtable< String,Integer> hashtable = getSubstringsHashtable(input);
        // String [] hashtable = new String[input];
        
        // Print the hashtable
        hashtable.forEach((key, value) -> System.out.println(key + ": " + value));
    }

}
