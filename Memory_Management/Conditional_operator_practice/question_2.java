package Memory_Management.Conditional_operator_practice;

public class question_2 {
    public static void main(String[] args) {
        int j = 45;
        int k = 56;
        if (j < k) {
            System.out.println("kisi din ye tamasha");
        }
        if (j != k) {
            System.out.println("muskurakar");
            if (k < j) {
                System.out.println("ye kya hua");

            } else if (k > j) {
                System.out.println("hm bhi dekhenge");
            }
        } else if (k == j) {
            System.out.println(j);

        }
        System.out.println("chak de oo chak de india");
    }
}
