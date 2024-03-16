package Memory_Management;
 class B extends access_modifier { // it is the subclass
     public static void main(String[] args) {
        access_modifier b = new access_modifier();
       // b.show(); // here private will give error because private method doest not access outside the class wheter it it the  outside the class or subclass
       access_modifier c = new access_modifier();
       c.hello(); // here protected will work outside the class and the inside the package.
       access_modifier d = new access_modifier();
       d.hey(); // here dafault work inside the package and outside the class.
     }

    }

public class access_modifier {

    // 4 type
    //1.Public:
    //2. Private
    //3. Protected
    //4.Default
 private void show(){
System.out.println("show works");

    }
    protected void hello(){
        System.out.println("hello works");        
    }
    void hey(){
System.out.println("hey works");
    }
    public static void main(String[] args) {
        access_modifier a = new access_modifier();
        a.show(); // here private  works inside the class 
        access_modifier b = new access_modifier();
        b.hello();// here protected  works inside the class 
        access_modifier c = new access_modifier();
        c.hey(); // here default  works inside the class
    }

}
