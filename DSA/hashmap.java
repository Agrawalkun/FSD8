package DSA;
import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer>map = new HashMap<>(); // creating the HashMap  HashMap is the keyword and string and integer is the data type and map is the name of the hashmap
        // inserting the key and value in the hashMap.
        map.put("China",140);
        map.put("India",40);
        map.put("USA",130);
    System.out.println(map);
// if we update any of the value of any key then it will change
map.put("India", 150);
System.out.println(map);

// Search Operation/ lookup operation
if(map.containsKey("India")){
    System.out.println("key is exist");
}
else{
    System.out.println("key is exist");
}
//wants the value of key
System.out.println(map.get("India"));

// different way to wrinte the for loop
// for(value:collection){ sout{value} it is used when we want to iterate the bunch of object
//} 
int arr[] = {12,15,18};
// 1st way
for(int i = 0; i<3;i++){
    System.out.print(arr[i]+" ");
}
System.out.println();
// 2nd way
for(int val : arr){
    System.out.print(val+" ");
}                                                                                           
System.out.println();

// Iteration in HashMap 
//Map.Entry<Integer,Integer>e: Map.entrySet();

for(Map.Entry<String,Integer>e:map.entrySet()){
    System.out.println(e.getKey());
    System.out.println(e.getValue());
}

    }
}
