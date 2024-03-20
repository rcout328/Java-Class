class Parent {
    public void display(){
        System.out.println("Overidden Method");
    }
}

class Child extends Parent{
    public void display (){
        System.out.println("Overiding Method");
    }
}

public class poly {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
        Parent P = new Parent();
        P.display();
        Parent P1 = new Child();
        P1.display();
    }
}
