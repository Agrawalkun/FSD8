public class Q22 {
    // while purchasing certain items, a discount of 10% is offered if the quantity purchased is 
// more than 100. If quantity and price per item are input through the keyboard, write a 
// program to calculate the total expenses
public static void main(String[] args) {
double quantity = 2;
double price = 150;
double total_price = (quantity*price);
if(total_price >100){
    double discount = (total_price * 10)/100;
    System.out.println((total_price - discount));
}

}
}
