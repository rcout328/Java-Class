import java.util.Scanner;


public class in {
    public static void main (String []args){
        
        Scanner sc = new Scanner(System.in);
        int a,b,sum,sub,div,mul;
        System.out.println("Enter values");
        a = sc.nextInt();
        b = sc.nextInt();
        sum = a+b;
        sub = a-b;
        mul = a*b;
        div = a/b;

        System.out.println("Enter sum: " +sum);
        System.out.println("Enter sub: " +sub);
        System.out.println("Enter mul: " +mul);
        System.out.println("Enter div: " +div);

    }
}
