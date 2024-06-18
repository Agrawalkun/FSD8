package Memory_Management;

public class deamon_thread extends Thread {
    // Daemon thread: it help to support the user thread , here garbage collector act as a daemon therad. it is the service provider to the user thread.
    // we can't create the daemon thread because it depend on the JVM.
    // so we can  create the user thread then convert into the daemon thread.
// currentThread().isDaemon() : it is the  method to check the current thread whether it is daemon thread or not.
// setDaemon(): it convert the user thread into the daemon thread.
public void run(){
    if(Thread.currentThread().isDaemon()){ //it is the  method to check the current thread whether it is daemon thread or not.
        System.out.println("daemon thread work");
    } else{
        System.out.println("work");
    }
}
public static void main(String[] args) {
    deamon_thread t1 = new deamon_thread();
    deamon_thread t2 = new deamon_thread();
    deamon_thread t3 = new deamon_thread();
    // if user thread activate ho gya to fir conversion nhi hoga, it always convert into daemon thread before the user thread is activated.
    t1.setDaemon(true);
t1.start();

t2.start();
t3.start();
}
}
