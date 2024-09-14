class manages {
    void manage() {
     System.out.println("manage all");

    }
}
class developer extends manages {
    void develop() {
        System.out.println("write only");

    }
}
class guest extends manages {
    void read() {
        System.out.println("read only");
    }
    
}


 public class Main {
    public static void main(String[] args) {
        guest g = new guest();
        developer d = new developer();
        manages m = new manages();
        g.read();
        d.develop();
        m.manage();
    }
}
