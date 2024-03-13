import java.util.Scanner;
public class a2 {

    public static int add (int []ar){
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum = sum+ar[i];
        }
        return sum;
    }
    public static int max (int []ar){
        int Max =  ar[0];
        for (int i = 0; i < ar.length; i++) {
            if(Max<ar[i]){
                Max =  ar[i];
            }    
        }
        return Max;
    }
   public static int search (int []ar,int key) {
        int i;
        for(i=0;i<ar.length;i++){
            if(key==ar[i]){
                return i;
            }
        }
        return -1;
   }
   
    public static void main(String[] args) {
        int [] ar = new int [10];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.println("Enter value");
            ar[i] = sc.nextInt();
        }
       int ans  = add(ar);
       System.out.println("Sum of all is = "+ans);
       int maxium  =  max(ar);
       System.out.println("Sum of all is = "+maxium);
       System.out.println("Enter key");
       int key = sc.nextInt();    
       int index = search(ar,key);
       System.out.println("Element found at index = "+index);
       if(index == -1){
           System.out.println("Element not found");
       }
       
    }
}
