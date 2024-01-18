public class Q37 {
    // Write a Java program that reads an positive integer and count the number of digits
    public static void main(String[] args) {
        int num = 54568;
        int i = 0;
        int rem =0;
        for( i =0;i<=num;i++){
             rem = num%10;
            num = num/10;
           
        }
        System.out.println(i);
        System.out.println(rem);
       
    }
}
