package Memory_Management;

public class file1 {
    
    public static void main(String[] args) {
        x();
        System.out.println("pranay");
    }
    static int x(){ // static 
        return 2;
    }
    byte f2(){ // non-static don't have a static keyword
        return 5;
    }
    void v(){ // void means it does not return any data 
        return; // no need to write return in case of void 
    }

}
