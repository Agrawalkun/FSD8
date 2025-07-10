package DSA;
import java.util.Scanner;
// find the freuency of the sorted array of each element in the array
 //[0,1,1,1,2,2,2,2,3,3,4,5,5,7]
 //o/p = 0-1 , 1-3, 2-4,3-2,4-1,5-2,6-0,7-1
 // o/p= [1,3,4,2,1,2,0,,1]
public class sorted_array {
    public static void main(String[] args) {
        //int arr[]={0,1,1,1,2,2,2,2,3,3,4,5,5,7};
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
int arr[]= new int [n]; // creating the array
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt(); // inserting an array 
}
int size  = arr[n-1]+1; // it is the size of hash table
int[] hash  = new int[size]; // creating a array of size of hash table
for(int i = 0;i<n;i++){
    int index = arr[i];
    hash[index]++;
}
for(int i= 0; i<hash.length ; i++){
    System.out.print(hash[i]);
}
sc.close();
        }
       
    }

