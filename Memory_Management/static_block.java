package Memory_Management;

public class static_block {
    int sum = 0;
    static int sum (int a,int b){
a = 10;
 b = 20;
int c = a+b;
return c;
    }
static{
    int a = 10;
    int b = 20;
    int c = a+b;
    System.out.println(c);

}
}
