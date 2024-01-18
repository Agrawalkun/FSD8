public class Q32 {
    //Given the length and breadth of a rectangle, write a program to find whether the area 
// of the rectangle is greater than its perimeter. For example, the area of the rectangle with 
// length = 5 and breadth = 4 is greater than its perimeter 
public static void main(String[] args) {
    

int l = 65;
int b = 64;
int area = l*b;
int parameter = 4*(l+b);
if(area>parameter){
    System.out.println("area is greater than parameter");
}else{
    System.out.println("area is not grater than parameter");
}
}
}