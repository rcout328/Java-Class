import java.util.Scanner;

public class Metoverload1 {
    
   
    public static void method1(int a, int b) {
        System.out.println("Sum "+ (a+b));
    }

    public static void method1(double c, double d) {
        System.out.println("Sum " + (c+d));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Int two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter Double two numbers");
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        method1(a,b);
        method1(c,d);
    }

}
