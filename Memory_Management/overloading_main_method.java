package Memory_Management;
// can we overload the main method
// the answer is yes because in overloading we can overload the method having same but change in signature and here parameter are changing. in original main method parameter os there but in the main that we created do not have the parameter.
public class overloading_main_method {
    public static void main(String[] args) {
        System.out.println("JVM will act first");
        main();// like a generalmethod we can call the method here.
    }
    public static void main(){
        System.out.println("MAin method with out parameter");
    }
}
