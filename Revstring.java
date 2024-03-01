import java.util.Scanner;


public class Revstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a,revstr="";
        int len ;
        System.out.println("Enter your Naa");
        a = sc.next();
        len = a.length();
        for(int i=(len-1);i>=0;i--){
            revstr = revstr + a.charAt(i);
        }
        if(a.equals(revstr)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    
    }
}
