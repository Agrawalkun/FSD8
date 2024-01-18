// package Memory_Management;
// // this is a infinite loop because after calling vbn it run in the loop and don'nt ternimate                                                                                                                
// public class file31 {
//     public static void main(String[] args) {
//         file8.vbn();
//     }
//     class file8{
//         static int vbn(){
// System.out.println("this is a vbn method");
// vbn();
// file8.vbn();
// return 90;
//         }
//     }

// }
package Memory_Management;
// teriminate the infinite loof                                                                                                            
public class static_method {
    public static void main(String[] args) {
        file8.vbn();
    }
    class file8{
        static int vbn(){
    System.out.println("this is a vbn method");
    int x=0; if(x!=0){
        vbn();
    }
    System.out.println("hello");
return 90;
        }
    }

}
