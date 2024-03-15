import java.util.Scanner;


class student{
    String name;
    int id;

    student(){
        name =  "Abc";
        id = 11;
    }
    student(int id ,String name){
        name =  name;
        id = id;
    }
    public void display() {
        
        System.out.println( "id = "+id + " " + "Name = "+ name );
        
    }
}

public class TestStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student s1 = new student();
        System.out.println("Enter your Name");
        String s = sc.nextLine();
        s1.display();
        System.out.println("Enter your id");
        int i= sc.nextInt();
        student s2 = new student(i,s);
        s2.display();
    }
    
    
}