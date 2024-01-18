package Memory_Management.Conditional_operator_practice;

public class Question_3_100 {
    public static void main(String[] args) {
    int y = 37;
    int d = 99;
    int j = 67;
   if(y==37){
       System.out.println(y);
   }
   else if(j!=67){
   if(y == 87){
        System.out.println(d);
   }
   if(d!=35){
    System.out.println(j);
    if(j>d){

        if(y>d || d>j){
 System.out.println(y);
        }
        else if(j>d){
System.out.println(j);
        }
    }
   }
      if(y <= 6){
System.out.println(y);
      }
      if(d!=j){
System.out.println(d);
      }
      else if(y>d && d>j){
System.out.println(j);
      }

   }
   else if(d<j){
System.out.println(y);
   }
}
}
