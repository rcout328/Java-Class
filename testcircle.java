import java.util.Scanner;


public class testcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        circle c1 = new circle();
        c1.r = sc.nextFloat();
        c1.area();
    }
    
}

class circle {
    float r;
    public  void area(){
        float pi=3.14f;
        float ans =  pi * r * r;
        System.out.println(ans);
    }
}


