package DSA;
import java.util.*;
public class selection_sort {
    // check it plz
    public static void print (int[] arr) {
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the item");
        int n = sc.nextInt();
        int selection[]= new int[n];
        for(int i =0;i<n;i++){
            selection[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++){
            for(int j =0;j<n-i-1;j++){

if(selection[j]>selection[j+1]){
   int temp = selection[j+1];
   selection[j+1] = selection[j];
   selection[j] = temp;
}
            }
            print(selection);
        }
        sc.close();
    }
   
  
    }
