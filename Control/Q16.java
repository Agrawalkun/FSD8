public class Q16 {
    //Write a program to check whether the triangle is equilateral, isosceles or scalene 
//triangle
public static void main(String[] args) {
    int x = 76;
    int y = 65;
    int z = 43;

if(x ==0 || y==0|| z==0){
System.out.println("not a triangle");
}
if(x ==y && y==z){
System.out.println("triangle is equilateral");
}
if(x ==y ){
System.out.println("triangle is isosceles");
}
if(x !=y && y!=z && x!=z){
System.out.println("triangle is scalene");
}
}
}