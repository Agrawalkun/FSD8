package Memory_Management;
class book{
    String name ;
    String author;
    book(String name,String aurhor){
        this.name = name;
        this.author = author;
    }
    void dispbook(){
        System.out.println(name);
        System.out.println(author);
    }
    class Library{
        String libraryName;
        String libraryAdress;
        Library(String libraryName,String libraryAdress){
this.libraryAdress =libraryAdress;
this.libraryName =libraryName;
        }

        void disp(){

        }
    }

}
public class has_a_relation {
    public static void main(String[] args) {
        book b1 = new book("fgh","fgf");
        book b2 = new book("ggh","kyuk");

    }
}
