public class Q24 {
    //If his basic salary is less than Rs. 1500, then HRA = 10% of basic salary and DA = 90% of 
// basic salary. If his salary is either equal to or above Rs. 1500, then HRA = Rs. 500 and DA = 
// 98% of basic salary. If the employee's salary is input through the keyboard write a program 
// to find his gross salary 
public static void main(String[] args) {
    double employee_salary = 4000;
    if(employee_salary <1500){
        double HRA  = (10*employee_salary)/100;
        double DA = (90*employee_salary)/100;
        double gross_salary = employee_salary + HRA +DA;
        System.out.println("HRA AND DA " + HRA + DA + " Employee Salary "+employee_salary + " and Gross salary "+ gross_salary );
        
    }
    else if(employee_salary >=1500){
        double HRA  = 500;
        double DA = (98*employee_salary)/100;
        double gross_salary = employee_salary + HRA +DA;
        System.out.println("HRA AND DA " + HRA + DA + "and Employee Salary "+employee_salary + " and Gross salary "+ gross_salary );
    }
}
}
