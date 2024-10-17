enum en {
    charan,
    jaya,
    sajid
}
public class main {
    public static void main(String[] args){
        en n = en.charan;
        System.out.println(n);
        System.out.println(en.jaya.ordinal());
        System.out.println(en.sajid.toString());
    }
}
