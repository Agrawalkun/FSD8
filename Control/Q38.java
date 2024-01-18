public class Q38 {
    //Write a java program that accepts three numbers from the user and check if numbers 
// are in "increasing" or "decreasing" order
public static void main(String[] args) {
    int num1 = 65;
    int num2 = 64;
    int num3 = 54;
    if(num1>num2 && num2>num3){
        System.out.println("numbers are in increasing order");
    }
   else if(num1<num2 && num2<num3){
        System.out.println("numbers are in decreasing order");
    }
    else{
        System.out.println("in no order");
    }
}

}
