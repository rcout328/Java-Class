import java.util.Scanner;


public class Def {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,rem=0,rev=0;
        System.out.println("Enter your number");
        n = sc.nextInt();

        while(n!=0){
            rem = n%10;
            rev  = (rev*10)+rem;
            n = n/10;
            
        }

        if(n==rem){
            System.out.println("it is valid palindrome number");
        }
        else{
            System.out.println("it is not valid palindrome number");
        }
    }
}
