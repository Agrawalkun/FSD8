package Memory_Management;
class Table1{
   synchronized void printTable(int n){ // methos is  synchronised
    for(int i = 1;i<=5;i++){
        System.out.println(n*i);
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
    }
    }
    class MyThread3 extends Thread{
        Table1 t ;
        MyThread3(Table1 t){
            this.t = t;
    
        }
        public void run(){
            t.printTable(5);
        }
    }
    
    class MyThread4 extends Thread{
    Table1 t;
    MyThread4(Table1 t){
        this.t = t;
    }
    public void run(){
        t.printTable(100);
    }
    }
public class synchronised {
    public static void main(String[] args) {
        Table1 obj = new Table1(); // only one object
        MyThread3 t1 = new MyThread3(obj);
        MyThread4 t2 = new MyThread4(obj);
        t1.start();
        t2.start();
    }
}
