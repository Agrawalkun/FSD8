public class Q18 {
    //Write a program to calculate profit or loss
    public static void main(String[] args) {
        int cost = 45;
        int selling_price = 55;
        if(cost>selling_price){
            System.out.println("loss");
             int loss =   cost-selling_price;
              System.out.println(loss);
        }
        else if(cost<selling_price){
            System.out.println("profit");
             int profit = selling_price - cost;
             System.out.println(profit);
        }
        else if(cost ==selling_price){
            System.out.println(" no profit no loss");
        }
       
       
       

    }
}
