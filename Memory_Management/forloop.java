package Memory_Management;

public class forloop {
    public static void main(String[] args) {
        for(int i = 0; i<4;i++){ // initialization then condition then updation 
System.out.print(i + " ");
System.out.println("hi");
if(i==2){
    continue; // it will continue the loop but if we use break as the contidition is true it will break the for loop 
}
if(i==3){
    break; //we use break as the contidition is true it will break the for loop 
}
        }
    }
}
