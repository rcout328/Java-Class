import java.util.Scanner;

public class task2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a;
        double b;
        System.out.println("Enter values");
        a = sc.nextInt();
        b = sc.nextDouble();
        // Write java program minium number among 2 number using conditonal operator
        double c =  (double)a/b;
        System.out.println(c);
    }
}
