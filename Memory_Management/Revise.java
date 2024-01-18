package Memory_Management;

class r {
    static int y() {
        int h = 0;
        System.out.println(h);
        return 67;
    }

    float b() {
        double r = 90.8f;
        System.out.println(r);
        return 45;
    }
}

public class Revise {
    int a = 89;

    public static void main(String[] args) {
        int j = 90;
        System.out.println(j);
        int s = a();// calling the static method
        Revise h = new Revise(); // object creation
        float k = h.b();
        Revise.d.b();
        Revise.d t = h.new d();
        int u = t.j();
        // g i = new g();
        // i.b();
        r.y();
        g.a();
      
    }

    static int a() {

        int h = 34;
        System.out.println(h);
        return 8;
    }

    float b() {
        double r = 89.45;
        return 90.56f;
    }

    class d {
        static float b() {
            int j = 56;
            return 90.56f;
        }

        int j() {
            int k = 90;
            System.out.println(k);
            return 89;
        }
    }
}

class g {
static int a() {
int h = 0;
System.out.println(h);
return 67;
}

float b() {
double r = 90.8f;
System.out.println(r);
return 45;
}
}
