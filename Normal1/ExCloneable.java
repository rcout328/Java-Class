class copy implements Cloneable {
    String s;

    copy(String s) {
        this.s = s;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ExCloneable {
    public static void main(String[] args) throws CloneNotSupportedException {
        copy s1 = new copy("s1 he ye");
        copy s2 = (copy) s1.clone();
        System.out.println(s1.s);
        System.out.println(s2.s);
    }
}



