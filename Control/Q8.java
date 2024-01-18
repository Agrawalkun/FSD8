public class Q8 {
    // Write a program to input any alphabet and check whether it is vowel or consonant
    public static void main(String[] args) {
        char x = 'a';
        if(x=='a'|| x=='e'||x=='i'||x=='o'||x=='u'){
            System.out.println("alphabet is a vowel");
        } 
        else if(x=='A'|| x=='E'||x=='I'||x=='O'||x=='U'){
            System.out.println("alphabet is a vowel");
        } 
        else if(x!='a'|| x!='e'||x!='i'||x!='o'||x!='u'){
            System.out.println("alphabet is a consonant");
        } 
        else if(x!='A'|| x!='E'||x!='I'||x!='O'||x!='U'){
            System.out.println("alphabet is a consonant");
        } 
    }
}
