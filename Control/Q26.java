public class Q26 {
    //. A company insures its drivers in the following cases:
// • If the driver is married
// • If the driver is unmarried, male & above 30 years of age
// • If the driver is unmarried, female & above 25 years of age
public static void main(String[] args) {
    String  gender= "male";
    String maratial_status = "unmarried";
    int age = 45;
    if(gender == "male" &&  age>30 &&  maratial_status=="unmarried" ){
System.out.println("company insure the driver");
    }
    else if(gender == "female" &&  age>25 &&  maratial_status=="unmarried" ){
System.out.println("company insure the driver");
    }
    if(  maratial_status=="married" ){
System.out.println("company insure the driver");
    }
}
}
