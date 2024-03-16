package Outside_package;

import Memory_Management.access_modifier;

public class outside_package extends access_modifier { // it is the subclass of the other package
    public static void main(String[] args) {
        outside_package a = new outside_package();
        //a.show(); // here method is private in the other package so we can't access it;
        outside_package b = new outside_package();
b.hello(); // here meethod is protected in the other package so we can access it outside the package inside the subclass
// outside_package b = new outside_package(); 
    }
}
