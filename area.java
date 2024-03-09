import java.util.Scanner;

public class area {
    public static void Area(double r){
       double pi = 3.14;
       System.out.println("Area of circle = " + pi * r * r );
    }
    public static void Area(int l,int b){

        int area = l * b;
        System.out.println("Area of rectangle = " + area);
    }
    public static void Area(double base,double height){
       System.out.println("Area of triangle = " + (0.5 * base * height));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius");
        double r = sc.nextDouble();
        System.out.println("Enter Reactangle");
        int  l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter triangle");
        double  bash = sc.nextDouble();
        double height = sc.nextDouble();
        Area(r);
        Area(l,b);
        Area(bash,height);
    }
}
