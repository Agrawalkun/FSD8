package DSA;

import java.util.*;
// find the freuency of the unsorted array of each element in the array
 //[2,1,3,2,2,7,6,6,1,1,3,2,5]
 //o/p = 0-0 , 1-3, 2-3,3-2,4-0,5-1,6-2,7-1
 // o/p= [0,3,3,2,0,1,2,1]
public class unsorted_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
        }
        // int max_element = arr[0];
        // for(int i = 0; i<n;i++){
        // if(arr[i]>max_element){
        // max_element = arr[i];
        // }
        // }
        int size = max + 1;
        int[] hash = new int[size];
        for (int i = 0; i < n; i++) {
            int index = arr[i];
            hash[index]++;
        }
        for (int i = 0; i < hash.length; i++) {
            System.out.print(hash[i]);
        }
        sc.close();
    }
}
