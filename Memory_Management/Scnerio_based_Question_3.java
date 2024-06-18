package Memory_Management;
// WAP to create a class called " Circle" with a radius attrribute . You can access and modify this attribute . Calvulate the area and circumference of the circle
class Circle{
    Float radius;

    Circle(float radius){
        this.radius = radius;
    }
float area(){
float area = radius*radius;
return area;
}
float circumference(){
float circumference = 2* (22/7)*radius;
return circumference;
}
void modify(float radius){
    this.radius = radius;
}

}
public class Scnerio_based_Question_3 {
    public static void main(String[] args) {
        Circle a = new Circle(4.6f);
a.area();
System.out.println();
a.modify(2);
        Circle cir = new Circle(2);
        cir.circumference();
        System.out.println();
    }
}
