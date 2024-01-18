public class Q29 {
    //. If the ages of Ram, Shyam and Ajay are input through the keyboard, write a program to 
// determine the youngest of the three
public static void main(String[] args) {
    int age1 = 43;
    int age2 = 54;
    int age3 = 33;
    if(age1<age2 && age1<age3){
System.out.println(age1 +" is the youngest");
    }
    else if(age2<age3 && age2<age1){
System.out.println(age2 +" is the youngest");
    }
   else{
System.out.println(age3 +" is the youngest");
    }
}
}
