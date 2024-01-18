package Memory_Management;

public class ladder_if { // ladder if means if ke bahar if 
    // nested if means if ke andar if
    public static void main(String[] args) {
        int x = 90;
        int e = 67;
        if(x<e){
            System.out.println("first if");
        }
        if(e>x){
            System.out.println("second if");
        }
        if(x!=0){
            System.out.println("third if");
        }
        else if(x==e){
            System.out.println("fourth if");
         
        }
        else if (e!=0){
            System.out.println("fifth if");
        }
    }
}
