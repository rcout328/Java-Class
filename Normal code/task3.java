import java.util.Scanner;

public class task3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter First Value");
        a = sc.nextInt();
        System.out.println("Enter Second Value");
        b = sc.nextInt();
         c =  (a<b) ? a : b; 
        System.out.println("Minium number "+c);
    }
}
