package DSA;
import java.util.*;
public class bubble_sort {
    public static void print (int[] arr) {
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the item fpr bubble sort");
        int n = sc.nextInt();
        int bubble[]= new int[n];
        for(int i =0;i<n;i++){
            bubble[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++){
            for(int j =0;j<n-i-1;j++){

if(bubble[j]>bubble[j+1]){
   int temp = bubble[j];
   bubble[j] = bubble[j+1];
    bubble[j+1] = temp;
}
            }
            print(bubble);
        }
    }
  
}
