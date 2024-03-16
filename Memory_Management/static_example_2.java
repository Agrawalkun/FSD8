package Memory_Management;

public class static_example_2 {
    String name;
    String aadharnumber;
    String pan;
    int accountnumber;
    double principle;
    double amount;
    double time;
    static double roi=10;

    static_example_2(String name, String aadharnumber, String pan, int accountnumber, double principle, double time) {
        this.name = name;
        this.aadharnumber = aadharnumber;
        this.pan = pan;
        this.accountnumber = accountnumber;
        this.principle = principle;
        this.time = time;
    }

    double calculate(double principle, double time) {
        double SI = (principle * roi * time) / 100;
        amount = SI+principle;
        return amount;
    }
void disp(){
    System.out.println("name:"+name);
    System.out.println("aadharnumber:"+aadharnumber);
    System.out.println(" accountnumber:"+ accountnumber);
    System.out.println("ammount he have to repay:"+amount);
    System.out.println("time:"+time);
}
public static void main(String[] args) {
    static_example_2 s = new static_example_2("mank","5467","7467",66768,50000,2.5);
    s.calculate(50000,2.5);
    s.disp();
}
}
