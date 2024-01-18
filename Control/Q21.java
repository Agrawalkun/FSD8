public class Q21 {
    // Write a program to input electricity unit charges and calculate total
    // electricity bill
    // according to the given condition:
    // • For first 50 units Rs. 0.50/unit
    // • For next 150 units Rs. 0.75/unit
    // • For next 250 units Rs. 1.20/unit
    // • For unit above 250 Rs. 1.50/unit
    // • An additional surcharge of 20% is added to the bill
    public static void main(String[] args) {
        int electicity_unit_charge = 40;
        if (electicity_unit_charge <= 50 && electicity_unit_charge > 0) {
            double charge = (electicity_unit_charge) * (0.50);
            System.out.println(charge);
            double subcharge = (20*charge)/100;
            double total_bill = charge+subcharge;
            System.out.println(total_bill);
        } else if (electicity_unit_charge <= 150 && electicity_unit_charge > 50) {
            double charge = (electicity_unit_charge) * (0.750);
            System.out.println(charge);
              double subcharge = (20*charge)/100;
            double total_bill = charge+subcharge;
            System.out.println(total_bill);
        } else if (electicity_unit_charge <= 250 && electicity_unit_charge > 150) {
            double charge = (electicity_unit_charge) * (1.20);
            System.out.println(charge);
              double subcharge = (20*charge)/100;
            double total_bill = charge+subcharge;
            System.out.println(total_bill);
        } else if (electicity_unit_charge > 250) {
            double charge = (electicity_unit_charge) * (1.50);
            System.out.println(charge);
              double subcharge = (20*charge)/100;
            double total_bill = charge+subcharge;
            System.out.println(total_bill);
        }

    }
}
