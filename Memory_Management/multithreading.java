package Memory_Management;

public class multithreading extends Thread { // it is the way to create the thread
    // THREADS: smallest unit of the process. all th thread load inside the CPU
    // register at the end
    // to load the thread: in-built: Thread class (extends to inherit the property)
    // Runnable Interface (implements to inherit the property)
    // int String = 24; can use the class and interface name as the variable name
    // int Runnable = 24;

    // THREAD LIFE CYCLE
    // 1. new = to create the new thread
    // 2. activate = thread activate hoga , to activate the thread we use the word
    // start(); .
    // 3. Blocked/waiting = Sleep(); // it is like the deadlock , infinite waiting
    // hogi
    // 4. Timed waiting = Join(); // ek time ke baad doosra thread CPU me enter
    // hoga.
    // 5. terminate = to terminate the thread.
    // ek time pr multiprocess hoskti h but at a time 2 thread nhi chl skte h.
    public void run() { // it is the method to run the thread
        System.out.println("thred is running");
for(int i = 1 ; i<=5;i++){
// the thread will sleep for the 500 mili sec
try {
    Thread.sleep(500);
} catch (InterruptedException e) {

    System.out.println(e);
}
System.out.println(i);
}
    }

    public static void main(String[] args) {

        multithreading t1 = new multithreading();
        multithreading t2 = new multithreading();
        t1.start(); // start is the word to activate the thread.
        t2.start(); // start is the word to activate the thread.

    }

}
