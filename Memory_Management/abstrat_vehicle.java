package Memory_Management;
abstract class vehicles {
    abstract void get();
    abstract void set();
    
    
    }
    class cars{
    private String model;
     private int  year;
    
    void set(String model,int year){
        this.model = model;
        this.year = year;
    }
    
    void get(){
        System.out.println(model);
        System.out.println(year);
    }
    public String getmodel(){
        return model;
    }
    public void setmodel(String model){
        this.model = model;
    }
    public int getyear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }
}
    
    class truck{
    
    }
    class motorcycles{
    
    }
public class abstrat_vehicle {
public static void main(String[] args) {
    cars c = new cars();
    c.set("lamniso",1954);
    c.get();
}
    
}
