package DSA;
import java.util.Scanner;

public class binary_search {
    public static void main(String[] args) {
         Scanner sc =  new Scanner(System.in);
         System.out.println("enter the value of n");
        int n = sc.nextInt();
        int arr[]= new int [n]; // creating the array
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt(); // inserting an array 
}
int key = 5;
int ans = -1;
int i = 0, j=n-1;
while(i<=j){
    int mid = i+(j-i)/2;
if(key == arr[mid]){
ans = mid;
break;
}
else if(key>arr[mid]){
    i = mid+1;
}
else{
    j= mid-1;
}

}
System.out.println(ans);
sc.close();
    }
}
