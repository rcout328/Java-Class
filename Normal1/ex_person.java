import java.util.ArrayList;
import java.util.Collections;

class person implements Comparable<person> {
    String name;
    int age;

    person(int age, String name) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(person o) {
        if (age == o.age) {
            return name.compareTo(o.name); // Compare names if ages are equal
        } else if (age > o.age) {
            return 1;
        } else {
            return -1;
        }
    }
}

public class ex_person {
    public static void main(String[] args) {
        person p1 = new person(10, "a");
        person p2 = new person(11, "b");
        person p3 = new person(12, "c");
        person p4 = new person(13, "d");
        person p5 = new person(14, "e");
        ArrayList<person> a1 = new ArrayList<>();
        a1.add(p1);
        a1.add(p2);
        a1.add(p3);
        a1.add(p4);
        a1.add(p5);
        Collections.sort(a1);
        for (person p : a1) {
            System.out.println(p.name + "__" + p.age);
        }
    }
}
