package Memory_Management;

class parent {
    String name;
    int age;
    int number =53454; // parent class me variable declare krke chlid class ke method me super keyword ke through call kr do
// constructor calling throug super keyword.
    parent(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void disp() {
        System.out.println(name);
        System.out.println(age);
    }
}

class Child10 extends parent {
    String address;
    Child10(String name, int age , String address) {
        super(name, age);
        this.address = address;
    }
    void show() {
     
       super.disp(); // calling the method bina disp ko call kre hi disp ki cheeze call ho jati h.
       System.out.println(address);
       System.out.println(super.number);// calling the variable through super keryword
    }
}

   

public class super_keyword {
    // super keyword is used to 
    // when parent class ke constructor , variable, methods ko child class me call krna ho.
    //
    public static void main(String[] args) {
        parent p = new parent("ranu",54);
        p.disp();
        Child10 c = new Child10("janu",34,"thtshrsth");
        // c.disp();
        c.show();
        
    }

}

