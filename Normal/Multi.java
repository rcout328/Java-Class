class Gparant {
    public void display(){
        System.out.println("Gparent");
    }
}
class Parent extends Gparant{
    public void display1(){
        System.out.println("Parent");
    }
}

class child extends Gparant{
    public void display2(){
        System.out.println("Child");
    }
}


public class Multi {
    public static void main(String[] args) {
        child c1 = new child();
        Parent p1 = new Parent();
        c1.display();
        p1.display1();
        c1.display2();
    }
}
