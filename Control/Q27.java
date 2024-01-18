public class Q27{
    //. Write a program to calculate the salary as per the following table
// Gender Year of Service Qualifications Salary
// Male >= 10 Post - Graduate 15000
//      >= 10 Graduate 10000
//      < 10 Post - Graduate 10000
//      < 10 Graduate 7000
// Female >= 10 Post - Graduate 12000
//        >= 10 Graduate 9000
//        < 10 Post - Graduate 10000
//        < 10 Graduate 6000
public static void main(String[] args) {
    int service_year = 5;
    String gender = "male";
    String graduation ="graduate";
    if(service_year>=10&& gender =="male"&& graduation =="post-graduate" ){
        System.out.println(" Salary 15000");
    }
    else if(service_year>=10&& gender =="male"&& graduation =="graduate" ){
        System.out.println("Graduate and Salary 10000");
    }
   else if(service_year<10&& gender =="male"&& graduation =="post-graduate" ){
        System.out.println("Graduate and Salary 10000");
    }
    else if(service_year<10&& gender =="male"&& graduation =="graduate" ){
        System.out.println("Graduate and Salary 7000");
    }
    else if(service_year>=10&& gender =="female"&& graduation =="post-graduate" ){
        System.out.println("Graduate and Salary 12000");
    }
    else if(service_year>=10&& gender =="female"&& graduation =="graduate" ){
        System.out.println("Graduate and Salary 9000");
    }
    else if(service_year<10&& gender =="female"&& graduation =="post-graduate" ){
        System.out.println("Graduate and Salary 10000");
    }
    else if(service_year<10&& gender =="female"&& graduation =="graduate" ){
        System.out.println("Graduate and Salary 6000");
    }
}
}