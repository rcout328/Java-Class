import java.util.Scanner;

public class Mwithretandarg {
    public static int add(int a ,int b){
        return(a+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,result;
        System.out.println("Enter values");
        a = sc.nextInt();
        b = sc.nextInt();
        result = add(a,b);
        System.out.println("Sum" + result);

    }
}
