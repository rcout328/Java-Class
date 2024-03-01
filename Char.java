import java.util.Scanner;

public class Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        char b;
        System.out.println("Enter your character");
        a = sc.next();
        b = a.charAt(0);
        switch(b){
            case 'a':System.out.println("You enter vowel a");
            break;
            
            case 'e':System.out.println("You enter vowel e");
            break;

            case 'i':System.out.println("You enter vowel i");
            break;

            case 'o':System.out.println("You enter vowel o");
            break;

            case 'u':System.out.println("You enter vowel u");
            break;

            case 'A':System.out.println("You enter vowel A");
            break;

            case 'E':System.out.println("You enter vowel E");
            break;

            case 'I':System.out.println("You enter vowel I");
            break;

            case 'O':System.out.println("You enter vowel O");
            break;

            case 'U':System.out.println("You enter vowel U");
            break;

            default: System.out.println("you are enter consolent "+b);
            break;
        }
    
    }
}
