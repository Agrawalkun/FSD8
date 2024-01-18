package Memory_Management;

public class if_2 {
    public static void main(String[] args) {
        int x = 34;
        int y = 45;
        int z = 64;

        if(x<y){ // if / else-if is the control statement and it is always learn always single time
            // in java () these paranthenses always want logic which always give true/flase but in C++ it give 0/1.
            // control statement used in loops. 
            System.out.println("print the 1st if");
            System.out.println(y);
            if(y<z){
                System.out.println(z);
            }
        }
        System.out.println("outside the both if");
    }
}
// pipe: | 
// ampersend : &