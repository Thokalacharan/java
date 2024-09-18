
class guest {
    void read() {
        System.out.println("read only");
    }
    
}
class manage extends guest {
    void manage() {
     System.out.println("manage only");

    }
}
 public class Main {
    public static void main(String[] args) {
        manage m = new manage();
        m.read();
        m.manage();
    }
}
