import java.util.Scanner;

public class Method1 {

    public static void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values");
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Add"+(a+b));
    
    }
    public static void main(String[] args) {
        add();
        System.out.println("done");
    }
}
