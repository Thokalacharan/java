interface iphone {
    public void copy();
    public void cut();
    public void paste();
}
class phone implements iphone {
        public void copy() {
            System.out.println("copy the code");
        }
        public void cut() {
            System.out.println("cut the code");

        }
        public void paste(){
                        System.out.println("paste the code");

        }

        
        

}
  public class Main {
     public static void main(String[] args) {
         phone c = new phone();
         c.copy();
         c.cut();
         c.paste();
     }
 }
