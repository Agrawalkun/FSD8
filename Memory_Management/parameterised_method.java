package Memory_Management;

public class parameterised_method {
    public static void main(String[] args) {
        int l =20;
        int b = 30; 
        square(l,b); // calling the static parameterised method
        double u = square(l,b); // storing the value of the method 
        System.out.println(u); // printing the value of method 
        return;
    }
    static double square(int l,int b){ // parameterised method 
double ans = l*b;
return ans;
    }
}
