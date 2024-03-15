import java.util.Scanner;


class student{
    String name;
    int id;
    int age;
    student(){
        name =  "Abc";
        id = 11;
        age =  22;
    }
    student(int id ,String name,int age){
        this.name =  name;
        this.id = id;
        this.age = age;
    }
    public void display() {
        
        System.out.println( "id = "+id + " " + "Name = "+ name + "age = " +age);
        
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
        System.out.println("Enter your age");
        int l= sc.nextInt();
        student s2 = new student(i,s,l);
        s2.display();
    }
    
    
}