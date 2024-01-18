public class Q5 {
    // Write a program to check whether a number is even or odd
public static void main(String[] args) {
    int x = 65;
    if(x==0){
        System.out.println("neither even or odd");
    } else if(x==1){
        System.out.println("no. is odd");
    }
    else if((x%2)==0){
        System.out.println(x+ " number is even");
    }else{
        System.out.println(" number is odd");
    }
}
}
