package Memory_Management;
// garbage collector : it can only remove the object which is formed with new keyword.
// Finallize: it can remove the object which is made through ohter refference rather than new keyword.
// jo data stack me store hota h to turant remove hota h 
// jo data heap me store hota h use garbage collector hi remove krta h kb krta h pta nhi .

// two ways to remove the object
//1. object ko null kr do 
// object ko  equal kr do ( s1 =s2)
public class garbage_collector {
    public void finalize(){ // it is in-built method 
        System.out.println("object is garbage collectod");
    }
    public static void main(String[] args) {
        garbage_collector s1 = new garbage_collector();
        garbage_collector s2 = new garbage_collector();
        s1 = null;
        s2 = null;
        System.gc();// activating the garbage collector . internally call hota h


    }
}
