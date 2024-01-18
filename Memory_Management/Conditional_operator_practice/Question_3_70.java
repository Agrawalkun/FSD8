package Memory_Management.Conditional_operator_practice;
// A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
// Ask user for their salary and year of service and print the net bonus amount.
public class Question_3_70 {
    public static void main(String[] args) {
        int year = 6;
        int salary = 10000;
     if(year>5){
        double bonus = (0.05 *salary);
        System.out.println( "bonus: "+ bonus + " net bonus: "+ (salary+bonus));
     }else{
        System.out.println("no bonus");
     }
    }
}
