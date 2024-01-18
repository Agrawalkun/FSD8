package Memory_Management.Conditional_operator_practice;

public class Question_3_84 {
    public static void main(String[] args) {
        int k = 90;
        int h = 91;
        if(true){
            System.out.println("always execute");
        }

        System.out.println("outside of if");
  
        if(k<h && h<k){
            System.out.println("first line executed");

            if(h>k){
                System.out.println("nested if executed");
            }
        }
        System.out.println(k!=h);
    }
    
}
