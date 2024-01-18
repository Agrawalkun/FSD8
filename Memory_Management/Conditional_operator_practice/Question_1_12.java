package Memory_Management.Conditional_operator_practice;

public class Question_1_12 {
    public static void main(String[] args) {
        int x = 89;
        int y = 45;
        if (x > y) {
            System.out.println("tumhe dil lagi bhool jaani padegi");
            if (y < x) {
                System.out.println("zara kisi se dil lga kr to dekho");
            }
            if (y != 0) {
                if (x != 0) {
                    if (y == x) {
                        if (x == 89) {
                            System.out.println("mere saath shame bita kr to dekho");
                        } else if (y == 45) {
                            System.out.println("mohhabat ki raho me aakar to dekho");
                        }

                    }
                    System.out.println("banno re banno meri ,chali sasural ");
                }
            }
        } else if (y < x) {
            if (x == y) {
                if (x >= 0) {
                    if (y <= 0) {
                        if (y == 45) {
                            System.out.println("toot chaar pai whi ");
                        }
                    }
                }
            }
            System.out.println("dekho shad maani ho gyi");
        }
    }
}
