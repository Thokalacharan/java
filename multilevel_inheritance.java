
class guest {
    void read() {
        System.out.println("read only");
    }
    
}
class developer extends guest {
    void develop() {
        System.out.println("write only");

    }
}
class manage extends developer {
    void manage() {
     System.out.println("manage only");

    }
}
 public class Main {
    public static void main(String[] args) {
        manage m = new manage();
        m.read();
        m.develop();
        m.manage();
    }
}
