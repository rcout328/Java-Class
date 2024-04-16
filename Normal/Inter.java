
interface language{
    abstract void getName(String s);
}

class KK implements language{
    public void getName(String s){
        System.out.println("You are enrolled in " + s);
    }
}
public class Inter {
    public static void main(String[] args) {
        KK k =  new KK();
        k.getName("mern");
    }
}
