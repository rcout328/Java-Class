
import java.util.Scanner;

public class IF2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter First Value");
        a = sc.nextInt();
        System.out.println("Enter Second Value");
        b = sc.nextInt();
        System.out.println("Enter Third Value");
        c = sc.nextInt();
        // Write java program minium number among 2 number using conditonal operator
         if(a>b&&a>c){
            System.out.println("A is max "+a);
         }
         else if(b>c){
            System.out.println("B is max "+b);
         }
         else{
            System.out.println("C is max "+c);
         }
    }
}
