

public class Prime2 {
    public static void main(String[] args) {
        boolean flag = true;
        int i;
        int n =Integer.parseInt(args[0]);
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
            System.out.println("Not prime");
          }
           
    }
}
