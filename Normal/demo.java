class student {
    String name;
    int id;
    public void display(){
        System.out.println("Name of student " +name);
        System.out.println("Id of student " +id);

    }

}
public class demo {

    public static void main(String[] args) {
        student s1  = new student();
        s1.name = "rcout";
        s1.id  = 12;
        s1.display();
 
    }

}
