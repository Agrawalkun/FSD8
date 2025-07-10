package DSA;

import java.util.Scanner;

public class merge_sort {
    public static void Msort(int[]arr,int start,int end){
        if(start>=end) return;
        int mid = start+(end-start)/2;
        Msort(arr,start,mid); // divide the array into the single sub array firstly left will divide fully then the right array divide fully
        Msort(arr,mid+1,end);// divide the array into the single sub array
        merge(arr,start,mid,end); // it work the conqure

    }
    public static void merge(int[]arr,int s, int mid,int e){
        int left = mid -s+1;
        int right = e - mid; // e - (mid+1)+1

        int[]L = new int[left]; // create the left array
        int[]R = new int[right];// create the right array

        for(int i =0;i<left;i++){ // inserting the element in the left array
            L[i] = arr[s+i];
        }
        for(int i =0;i<right;i++){ // inserting the element in the right array
            R[i] = arr[mid+1+i];
        }
        int i =0,j=0,k=s;
        while(i<left && j<right){
            if(L[i]<R[j]){
                arr[k++]=L[i++];
            }
            else{
                arr[k++]=R[j++];
            }
        }
        while(i<left){
            arr[k++]=L[i++];
        }
        while(j<right){
            arr[k++]=R[j++];
        }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter the item fpr merge sort");
        int n = sc.nextInt();
        int mer[]= new int[n];
        for(int i =0;i<n;i++){
            mer[i] = sc.nextInt();
        }
        Msort(mer,0,n-1);
        for(int i : mer){
            System.out.println(i);
        }
        sc.close();
    }
}
