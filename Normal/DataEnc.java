 class hello{
    private int weight = 10;
    public int get(){
        return weight;
    }

    public void set(int w){
        weight = w;
    }

    
}

public class DataEnc{
    public static void main(String[] args) {
        hello h1 = new hello();
        System.out.println(h1.get());
        h1.set(50);
        System.out.println(h1.get());

    }
}