package Memory_Management;
class Animal{
void eat(){
    System.out.println("eating");
}
}
class harbivorous extends Animal{
    void eat_grass(){
        System.out.println("eating grass");
    }
}
class carnivorous extends Animal{
    void eat_flesh(){
        System.out.println("eating flesh");
    }
}
class omnivorous extends Animal{
    void eat_both(){
        System.out.println("eating flesh and grass");
    }
}

public class heirarchical {
    public static void main(String[] args) {
        omnivorous om = new omnivorous();
        om.eat_both();
        
    }
}
