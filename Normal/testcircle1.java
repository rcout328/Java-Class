
class circle {
    
    float r;

    circle(){
        float r = 1;
    }

 public void area(){
    float pi = 3.14f;
    float ans =  pi*r*r;
    System.out.println("Area of circle " +ans);
 }
}

public class testcircle1{
    public static void main(String[] args) {
        circle c1 = new circle();
        c1.r = 1;
        c1.area();
        circle c2 = new circle();
        c2.area();

    }
    
}

