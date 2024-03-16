package Memory_Management;
class animals{
    void eat(){
        System.out.println("eating");
    }
    int legs =4;
}
class tiger extends animals{
    int legs =3;
    void eat(){
        System.out.println("eating flesh");
    }
}
class dogs extends animals{
    int legs =2;
    void eat(){
        System.out.println("eating biscuit");
    }
}

public class overridingExample {
    public static void main(String[] args) {
        dogs d1 = new dogs();
        animals d2 = new dogs(); // PARENT CLASS KI MADA SE BHI CHILD CLASS KO  CALL KR SKTE H.
        d1.eat();
        d2.eat();
        System.out.println(d1);
    }
}
