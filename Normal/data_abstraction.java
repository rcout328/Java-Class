
abstract class Base{

    Base(){
        System.out.println("Base class const");
    }

    void Method () {
        System.out.println("Concrete method");
    }

    final void method (){
        System.out.println("Final Concrete method");
    }

    abstract void sleep();
}


class derived extends Base{
    derived(){
        System.out.println("dervied const");
    }

    public void sleep(){
        System.out.println("Sleeping");
    }

}

public class data_abstraction{
    public static void main(String[] args) {
        derived b = new derived();
        b.Method();
        b.method();
        b.sleep();
    }
}
