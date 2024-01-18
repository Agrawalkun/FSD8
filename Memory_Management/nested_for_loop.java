package Memory_Management;

public class nested_for_loop {
    public static void main(String[] args) {
        for(int i = 0; i<4 ; i++){
            for(int j =1; j<4; j++){
                if(i==3){
                    break;
                }

                if( i==j){
                    continue; // it will give the control to the above the for loop for performing the next iteration  so it doest print the nest line out of the loop
                }
                System.out.println(i + " "+ j);
            }
        }
    }
}
