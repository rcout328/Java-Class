final class F2 {
    final void inti(){
        final int f1 = 10;
        
    }
}
class F3 extends F2{
    public void display(){
        F2 f = new F2();
        f.inti();
        int value = f.f1;
        System.out.println();
    }
}

public class Fin {
    public static void main(String[] args) {
        F3 ff =  new F3();
        ff.display();
    }
}




