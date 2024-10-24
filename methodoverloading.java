public class main{
    public static void main(String[] args){
        int sum1=add(2,3);
        System.out.println(sum1);
    
        double sum2= add(2.3,4);
            System.out.println(sum2);
            int sum3=add(1,2,3);
                System.out.println(sum3);
                
    }
    public static int add(int a, int b){
        return a+b;
    }
        public static double add(double a, double b){
            return a+b;
            
        }
            public static int add(int a, int b,int c){
                return a+b+c;
            }


}
