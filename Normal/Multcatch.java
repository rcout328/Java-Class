import java.util.InputMismatchException;
import java.util.Scanner;

public class Multcatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Input a ");
            int a = sc.nextInt();
            System.out.println(a/0);
        }
        catch(ArithmeticException |InputMismatchException  e){
            System.out.println(e.toString());
        }
       
    }
}
