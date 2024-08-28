public class LinearSearch {

    public static void main(String[] args) {
        int i;
        int a[] = {5, 3, 8, 6, 2}; 
        int key = 6; 
        for(i=0;i<a.length;i++)
        if(key==a[i])
        {
            System.out.println("key is found");
            break;
        }
        else if(i==5)
        {
            System.out.println("key is not found");
        }
        
    }
}    
        
