package Memory_Management;
// inside the class call the object with the help of get and set method
class GetterSetter{
    private int a ;
    private int b ;

    // setter methods
    public void setA(int first){
        this.a = first;
    }
    public void setB(int second){
        this.b = second;
    }

    //getter methods
    public int getA(){
        return a;

    }
    public int getB(){
        return b;

    }

    // methods
    public void sum(){
        System.out.println(a+b);
    }
    public void sub(){
        System.out.println(a-b);
    }


}
public class get_set_method {
    // making the object
    public static void main(String[] args) {
        GetterSetter method = new GetterSetter();
        // setting the value
        method.setA(1);
        method.setB(5);

        // getting the value
        System.out.println("A =" +method.getA());
        System.out.println("B =" +method.getB());
        

        // calling the function
        method.sum();
        method.sub();
    }
  

}
