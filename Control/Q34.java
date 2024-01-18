public class Q34 {
    // A library charges a fine for every book returned late. For first 5 days the fine is 50 
// paise, for 6-10 days fine is one rupee and above 10 days fine is 5 rupees. If you return the 
// book after 30 days your membership will be cancelled. Write a program to accept the 
// number of days the member is late to return the book and display the fine or the 
// appropriate message

public static void main(String[] args) {
    int days = 4;
    if(days<=5 && days>0){
        System.out.println("charge is 50 paisa");
    }
    else if(days<=10 && days>6){
        System.out.println("charge is 1 rupee");
    }
   else if(days>10){
        System.out.println("charge is 5 rupee");
    }
   else if(days>30){
        System.out.println("menbership is cancelled");
    }
}
}
