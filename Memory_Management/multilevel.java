package Memory_Management;
//  multilevel inheritance
class grandfather {
    void listen() {
        System.out.println("listen tv");
    }

    void eat() {
        System.out.println("eating");
    }
}

class father1 extends grandfather {
    void watch() {
        System.out.println("watch tv");
    }

    void read() {
        System.out.println("books");
    }
}

class daughter extends father1 {
    void use() {
        System.out.println("use laptop");
    }

    void write() {
        System.out.println("eassy");
    }
}

public class multilevel {
    public static void main(String[] args) {
        
    
    daughter d = new daughter();
    d.eat();
    d.listen();
    d.read();
    d.watch();
    d.use();
    d.write();
    }
}
