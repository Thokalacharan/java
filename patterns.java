i= rows and j= columns
public class pattern1 {
    public static void main(String[] args) {
       int n=4;
       for(int i=1;i<=n;i++){
         for(int j=1;j<=i;j++){
            System.out.print("*");
         }
         System.out.println();
       }
    }
}

public class pattern2 {
    public static void main(String[] args) {
       int n=4;
       for(int i=1;i<=n;i++){
         for(int j=1;j<=n;j++){
            System.out.print("*");
         }
         System.out.println();
       }
    }
}

public class pattern3 {
    public static void main(String[] args) {
       int n=4;
       for(int i=1;i<=n;i++){
         for(int j=1;j<=n-i+1;j++){
            System.out.print("*");
         }
         System.out.println();
       }
    }
}

public class pattern4 {
    public static void main(String[] args) {
       int n=4;
       for(int i=1;i<=n;i++){
         for(int j=1;j<=i;j++){
            System.out.print(j+" ");
         }
         System.out.println();
       }
    }
}
