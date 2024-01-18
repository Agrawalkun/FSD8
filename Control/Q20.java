public class Q20 {
    //Write a program to input basic salary of an employee and calculate its Gross salary 
// according to following:
// • Basic Salary <= 10000 : HRA = 20%, DA = 80%
// • Basic Salary <= 20000 : HRA = 25%, DA = 90%
// • Basic Salary > 20000 : HRA = 30%, DA = 95% 
public static void main(String[] args) {
    int x =10000;
    int gross_salary;
    int HRA ;
    int DA;
    if(x<=10000){
    System.out.println("HRA=20% , DA=80%");
    HRA = (20*x)/100;
    DA = (80*x)/100;
gross_salary = x + HRA + DA;
System.out.println(gross_salary);

    }
   else if(x<=20000){
    System.out.println("HRA=25% , DA=90%");
     HRA = (25*x)/100;
    DA = (90*x)/100;
gross_salary = x + HRA + DA;
System.out.println(gross_salary);
    }
   else if(x>20000){
    System.out.println("HRA=30% , DA=95%");
     HRA = (30*x)/100;
    DA = (95*x)/100;
gross_salary = x + HRA + DA;
System.out.println(gross_salary);
    }


}}

