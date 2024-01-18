package Memory_Management;

public class leap_year {
    public static void main(String[] args) {
        
    
       int n = 1900;
        if( n%4==0 || n%400==0 && n%100!=0){
            System.out.println("This is a leap year");
        } else{
            System.out.println("this is not a leap year");
        }
    }
}

