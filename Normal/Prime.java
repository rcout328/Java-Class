import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter Value");
        boolean flag = true;
        int i;
        int n = sc.nextInt();
        for(i=2;i<n;i++){
            if(n%i==0){
                flag = false;
                break;
            } 
          }
          if(n==1){
            System.out.println("1 is prime"+n);
          }
          if(flag){
            System.out.println("prime");
          }
          else{
            System.out.println("Prime number");
          }
           
    }
}
