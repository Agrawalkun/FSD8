
package Memory_Management;
import java.util.Scanner; // it is the input taken library , util package se sirf scanner hi lekar aaye h 
// if we want to take all the things forfusing then we write import java.util.* it is for all the library
public class sand_watch_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // it is the object to call the method which present in the java.util library
System.out.println("enter the value of n");
        int n = sc.nextInt(); // it is the method which is present in the util library so we have to make the object to call it
       if(n%2!=0){
        for(int i =0;i<=n/2;i++){
for(int j =0 ;j<i;j++){
    System.out.print("  ");
}
for(int k=i;k<=n/2;k++){
    System.out.print("* ");
}
for(int h=i;h<n/2;h++){
    System.out.print("* ");
}
System.out.println();
       }
       for(int i =0;i<n/2;i++){
        for(int j =i+1;j<n/2;j++){
            System.out.print("  ");
        }
        for(int k = 0;k<=i+1 ;k++){
            System.out.print("* ");
        }
        for(int h =0;h<=i;h++){
            System.out.print("* ");
        }
        System.out.println();
       }
    } else{
        for(int i =0;i<n/2;i++){
            for(int j = 0;j<i;j++){
System.out.print("  ");
            }
            for(int k =i;k<n/2;k++){
                System.out.print("* ");
            }
            for(int h=i;h<n/2;h++){
                System.out.print("* ");
            }

            System.out.println();
        }
        for(int i = 0;i<n/2;i++){
            for(int j =i+1;j<n/2;j++){
                System.out.print("  ");
            }
            for(int k=0;k<=i;k++){
System.out.print("* ");
            }
            for(int h =0;h<=i;h++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
        sc.close(); // it is used to close the class. write it at the ending of the code
//         int n =9;
//         for(int i=0;i<n;i++ ){
// for(int j =0 ;j <n ; j++){
//     if( i==0 || i==n-1 || i==j ||i+j==n-1 ){
// System.out.print( "* ");
//     }else{
//         System.out.print("  ");
//     }
// }
// System.out.println();

  
// }

// float n =5;
// for(float i =0; i<n/2; i++){
//     for(float j =1; j<=i ;j++){
// System.out.print("  ");
//     }

//      for(float k=i;k<=n/2;k++){
//         // for(int h = 1; h<=k ; h++){
//                System.out.print("* ");
//         }
//         for(float h = i; h<n/2 ;h++)
//         {
//             System.out.print("* ");
//         }
        

        // if(i==1+i/2 || i==0){
        //     System.out.print("% ");
        // }
    //     System.out.print("*");
    // }
  
//     System.out.println();
// }
// for(float i=n/2 ; i <n ;i++) {
//     for(float j = i+1 ; j<n;j++){
//          System.out.print("  ");
//     }
//     for( float k =1 ; k<i-1 ; k++){
//  System.out.print("* ");
//     }
//     for(float h =1 ; h<i-1 ;h++){
//  System.out.print("* ");
//     }
//      System.out.println();
// }
// for(int i = n/2;i<n ; i++){
// for(int j =i+1; j<n ;j++){
//     System.out.print("$");
// }
// for(int k =0;k<=i ;k++){
//     System.out.print("*");
// }
//     System.out.println();
// }

        }
    }


