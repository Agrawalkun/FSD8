package Memory_Management;
// WAP to count the object created
public class count_a_object {
static int count =0;
    count_a_object(){
count++;
    }
    public static void main(String[] args) {
        count_a_object c = new count_a_object(); 
        count_a_object c1 = new count_a_object(); 
        System.out.println(count);



    }
}
