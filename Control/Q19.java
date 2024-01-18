public class Q19 {
    // Write a program to input marks of five subjects Physics, Chemistry, Biology,
    // Mathematics and Computer. Calculate percentage and grade according to
    // following:
    // • Percentage >= 90% : Grade A
    // • Percentage >= 80% : Grade B
    // • Percentage >= 70% : Grade C
    // • Percentage >= 60% : Grade D
    // • Percentage >= 40% : Grade E
    // • Percentage < 40% : Grade F
    public static void main(String[] args) {
        int Maths_marks = 95;
        int Physics_marks = 65;
        int biology_marks = 78;
        int chemistry_marks = 98;
        int computer_marks = 87;
        int total_marks = Maths_marks + Physics_marks + biology_marks + chemistry_marks + computer_marks;
        float percentage = ((total_marks * 100) / 500);
        System.out.println(percentage);
        if (percentage >= 90) {
            System.out.println("Grade A");
        } else if (percentage >= 80) {
            System.out.println("Grade B");
        } else if (percentage >= 70) {
            System.out.println("Grade C");
        } else if (percentage >= 60) {
            System.out.println("Grade D");
        } else if (percentage >= 40) {
            System.out.println("Grade E");
        } else if (percentage < 40) {
            System.out.println("Grade F");
        }
    }
}