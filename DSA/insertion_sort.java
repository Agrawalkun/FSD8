package DSA;

import java.util.Scanner;

public class insertion_sort {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter the item");
        int n = sc.nextInt();
        int insertion[]= new int[n];
        for(int i =0;i<n;i++){
            insertion[i] = sc.nextInt();
        }
        for(int i = 1;i<n;i++){
            int j = i-1;
            int x =insertion[i];
            while(j>=0 && insertion[j]>insertion[i] )
       {
        insertion[j+1] = insertion[j];
        j--;
             
            }
            insertion[j+1] = x;
        }
        
    }
}
