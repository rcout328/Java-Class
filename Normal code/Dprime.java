import java.util.Scanner;
public class Dprime {
    //make prime code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value");
        boolean flag = true;
        int n,i,j;
        n = sc.nextInt();
        for(i=2;i<=n;i++){
            flag=true;
            for(j=2;j<i;j++){
                if(i%j==0){
                    flag = false;
                    break;
                }
                if(flag){
                    System.out.println(i);
                }
            }
        }
    }
}
