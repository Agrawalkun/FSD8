package Memory_Management;
// threads are dependent on each other.
// value must be same for the dependency.

public class deadlock {
    public static void main(String[] args) {
        final String resource1 = "Mankshii";
        final String resource2="Mankshii";
        // t1 tries to lock resource1 then resource2
        Thread t1 = new Thread(){
            public void run(){
                synchronized(resource1){
                    System.out.println("Thread1:locked resource1");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        // TODO: handle exception
                        System.out.println("Thread1:loacked resource2");
                    }
                }
                synchronized (resource2){
                    System.out.println("Thread1:locked resource1");
                }
            }
        }
    }
}
