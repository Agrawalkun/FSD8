package Memory_Management;
public class static_example {
    String name;
    int id;
    String branch;
    static String college = "BU"; // when any variable or function is comman for evey object then we make the variable or function static

static_example(String name, int id, String branch){
    this.name = name;
    this.id=id;
    this.branch = branch;
}
void disp(){
    System.out.println("Name is:"+name);
    System.out.println("Id is:"+id);
    System.out.println("Branch is:"+branch);
    System.out.println("college is:"+college);
}

    public static void main(String[]args){
        static_example s1=new static_example("yinku", 2, "IT");
        s1.disp();
        static_example s2=new static_example ("tink",3,"cse");
        s2.disp();
    }
}

