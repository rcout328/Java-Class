public class Metoverload {
    
    public static void method1(int a, int b) {
        System.out.println("Sum "+ (a+b));
    }

    public static void method1(double a, double b) {
        System.out.println("Sum " + (a+b));
    }
    public static void main(String[] args) {
        method1(10,120);
        method1(10.0d,120.0d);
    }

}
