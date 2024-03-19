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

class child extends Parent{
    public void display2(){
        System.out.println("Child");
    }
}


public class Multi {
    public static void main(String[] args) {
        child c1 = new child();
        c1.display();
        c1.display1();
        c1.display2();
    }
}
