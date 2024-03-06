import java.util.Scanner;

public class Mwitharg {
    public static void add(int a,int b){
        System.out.println("Add" +(a+b));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter value");
        a = sc.nextInt();
        b = sc.nextInt();
        add(a,b);
    }
}
