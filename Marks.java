import java.util.Scanner;
public class Marks {
    



    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int Marks;
        System.out.println("Enter Marks");
        Marks = sc.nextInt();
        // Write java program minium number among 2 number using conditonal operator
        if(Marks >= 90 && Marks <= 101){
            System.out.println("Grade A");
        }
        else if(Marks >= 80 && Marks <= 101){
            System.out.println("Grade B");
        }
        else if(Marks >= 70 && Marks <= 101){
            System.out.println("Grade C");
        }
        else if(Marks >= 60 && Marks <= 101){
            System.out.println("Grade D");
        }
        else if(Marks<= 35 && Marks <= 101){
            System.out.println("Fail");
        }
        else if(Marks <= 60 ){
            System.out.println("Grade E");
        }
        else{
            System.out.println("Enter proper");
        }
    }


}
