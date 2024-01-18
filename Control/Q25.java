public class Q25 {
    // The marks obtained by a student in 5 different subjects are input through the 
// keyboard. The student gets a division as per the following rules: Write a program to 
// calculate the division obtained by the student
// Percentage above or equal to 60 - First division
// • Percentage between 50 and 59 - Second division
// • Percentage between 40 and 49 - Third division
// • Percentage less than 40 – Fail
public static void main(String[] args) {
    int Maths = 98;
    int Physics = 96;
    int chemistry = 98;
    int hindi = 99;
    int english = 80;
    double percentage = ((Maths+Physics + chemistry + hindi + english)*100)/500;
    if(percentage >=60){
System.out.println("First Division");
    }
   else if(percentage >=50 && percentage <=59){
System.out.println("Second Division");
    }
   else if(percentage >=40 && percentage <=49){
System.out.println("Third Division");
    }
   else if( percentage <=40){
System.out.println("Fail");
    }
    System.out.println(percentage);
}
}
