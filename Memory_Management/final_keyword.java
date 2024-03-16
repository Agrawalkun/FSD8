package Memory_Management;
class parents{
    final int a = 45;
    //a =64; // can't change the value
// instansalizar or instance block claas ka direct method h
{
   
}
static {
    System.out.println("Static block is activated");
}
    final void disp(){
        System.out.println(a);

    }
    
}
final  class parent2 extends parents{
    final void g6y6(){
        System.out.println("gfhgh");

    }
}
// class parent3 extends parent2{ this will give error bcoz final method can't be inheritated

// }
public class final_keyword {
    // final keyword ka use value can't be overridden
    // final class can't be inheritated
    // class static nhi hoti
}
