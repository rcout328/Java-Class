
abstract class shape{
    abstract void draw();
}

 class circle extends shape{
    public void draw(){
        System.out.println("Circle draw");
    }
}

class rectengle extends shape{
    public void draw(){
        System.out.println("rectengle draw");
    }
}
public class abstract_draw {
    public static void main(String[] args) {
        circle c = new circle();
        rectengle r = new rectengle();
        c.draw();
        r.draw();
    }
}
