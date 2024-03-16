package Memory_Management;
// WAP the create a vehicle class take any of three properties and three behaviour inherit the property and behavior of the vehivcle class in car class and one method extra should be present in tthe car class.
// single inheritance
class vehicle{
    int wheel = 4;
    String company_name =" KTM";
    int price = 50000;
void color(){
    System.out.println(" black");
}
void model(){
    System.out.println("RC200");
}
void staring(){
    System.out.println("single");
}
}
class car extends vehicle{

    int wheel = 4;
    String company_name ="BMW";
    int price = 50000;

    void speed(){
        System.out.println(" good speed");
    }
}


public class vehicle_task {
    public static void main(String[] args) {
        car c = new car();
        c.model();
        c.color();
        c.staring();
        c.speed();
    }
}
