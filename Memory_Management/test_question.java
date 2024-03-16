package Memory_Management;
import java.util.Scanner;
public class test_question {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
   int p =0;
for(int i = 0;i<n;i++){
for(int j =0;j<=i;j++){
    if(i%2!=0){
        System.out.print(p+i-2*j+1+" ");
    }
    else{
        System.out.print(1+p+" ");
    }
    p++;
}

System.out.println();
}
sc.close();
}
}
