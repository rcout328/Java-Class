import java.util.Scanner;


public class Addloop {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a=1;
        int b=0;
        
        do{
            System.out.println("Enter number");
            a = sc.nextInt();
            b = b+a;
        }while((a!=0));
        System.out.println("Sum of numbers"+b);

    }
}
