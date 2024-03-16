package Memory_Management;

public class OOPS {
    // oops
    //1.class
    //2.object
    //3.polymorphism
    //4. inheritance
    // 5. data abstraction
    //6.encaps ulation

    // Class: it is the blueprint based on which object are created. logical entity
    // object: Instance of the class, having variable and behaviour. it is real world entities, having states and behaviour . Instance means ki at the time cheeze ek hi jgh present ho.

    // object has minimum two method.
    //' Create n object in single class.'

    // Naming Convention
    // 1. CamelCase: starting letter must be small and if there is two word combination then the 1st word of the first letter must be capital. used in the methods name, variables name and Package name
    //2. PascalCase: starting letter must be capital and if there is two word combination then the 1st word of the first letter must be capital used in  class name and Interface

    // Syntax of the class: 
   // class class_name{
           // body
 //  }

 //  5 ways of creating the object:

 // 1 Using new keyword
 //2. using newInstance()
 //3. using clone()
 //4. By serialization
 //5. by factory method

 // Syntax of  object :
 //1. class class_name referanvevariable = new class_name();
  //ex: Animal a = new Animal();
  // callig : a.method;

//2. new class_name().method_name();
  //ex:  new Animal().method();

//3. for multiple object
//Animal a = new Animal(), b= new Animal(),c=new Animal()... ;

// 4 segment of RAM : 1.Code segment
//                    2.Heap segment
//                    3.Stack segment
//                    4.Static space segment

// object , instance variable stored in the heap.
// local variable , reference  variable stord in  stack;      
// Static information (interface and class boxes) and instance information(object boxes) are stored in heap.
// Method   information is stored in run-time-stack .

// Types of variable:
//1. local variable- present in user defined method and the  main method 
//it is used where har method hi different functionality hogi aur different code hoga
//2. instance varaible - present in inside the class and outside the all the method
// it is used where har object ke liye  koi bhi variable comman ho. 
//3.static variable - present in inside the class and outside the all the method withusing the 'static' keyword . it is stored in the 'Static space' of the ram. 
//it is used where har object ke liye  koi bhi variable comman ho but space ek baar hi le

int a;
float b;
double c;
long d;
String str;
static  int f;
static int h = 10;
public static void main(String[]args){
  OOPS a1 = new OOPS();
  System.out.println(a1.a); // by default value print hongi.
  System.out.println(a1.b);
  System.out.println(a1.c);
  System.out.println(a1.d);
  System.out.println(a1.str);
   System.out.println(new OOPS().a); // object ke saath call krana
   System.out.println(new OOPS().f); // static bhi by default value print krta h without any initialization the value.
int h = 15;
System.out.println(h);

}





}
