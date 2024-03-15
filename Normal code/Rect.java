//Design a java class rect which contain this field and methods 
//1> length , width as an int
//2> defaualt const which inst all fields with 1
//3> int getArea() will return area of rect
import java.util.Scanner;


class rectangle {
    int l;
    int w;

    rectangle() {
        l = 1;
        w = 1;
    }

    public int getArea(){
       return(w*l);
    }
}

public class Rect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rectangle e1 = new rectangle(); 
        System.out.println("Enter lenght ");
        e1.l = sc.nextInt();
        System.out.println("Enter width ");
        e1.w = sc.nextInt();
        rectangle e2 = new rectangle(); 
        System.out.println("Area "+ e1.getArea());
        System.out.println("Area default"+ e2.getArea());
        


    
    }

}