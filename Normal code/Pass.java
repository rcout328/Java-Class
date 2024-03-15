
class objectpass{
    int a,b;

    objectpass(int i ,int j){
        a = i;
        b = j;
    }
    boolean equalto(objectpass o){
        return(o.a == a && o.b==b);
    }
}

public class Pass {
    public static void main(String[] args) {
        objectpass o1 = new objectpass(100,200);
        objectpass o2 = new objectpass(100,200);

        System.out.println("ob1==ob2" ob1.equalto(ob2));
    }
}
