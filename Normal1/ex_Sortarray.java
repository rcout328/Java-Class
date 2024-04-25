import java.util.ArrayList;
import java.util.Collections;

public class ex_Sortarray {
    public static void main(String[] args) {
        ArrayList <Integer> a1 = new ArrayList<>();
        a1.add(20);
        a1.add(5);
        a1.add(6);
        a1.add(10);
        a1.add(2);
        a1.add(50);
    //    System.out.println(a1.get(0));
        Collections.sort(a1);
        System.out.println(a1);
    }
}
