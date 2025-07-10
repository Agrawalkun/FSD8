package DSA;

import java.util.Scanner;

public class quick_sort {

    public static void Qsort(int[]arr,int start,int end) {
        if(start>=end) return;// faltu ke itration ku krna when it is already sorted
        int pivot = partition(arr,start,end);
        Qsort(arr, start, pivot-1);
        Qsort(arr,pivot+1,end);    
    }

    public static int partition(int[]arr, int s,int e) {
        int pivot = arr[e];
        int i = s-1;
        for(int j =s;j<e;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i]=arr[e]; // pivot apna end element h but pivot yhi banke destroy ho jayega isliye direct array me hi change kar diya.
        arr[e] = temp;
        return i;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("enter the item for quick sort");
       int n = sc.nextInt();
       int qui[]= new int[n];
       for(int i =0;i<n;i++){
           qui[i] = sc.nextInt();
       }
       Qsort(qui,0,n-1);
       for(int i :qui){
        System.out.println(i);
       }
       sc.close();
    }
}
