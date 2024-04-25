
class genricc <T>{
    T a;
    T b;
    void show(){
        System.out.println("Value of a "+a);
        System.out.println("Value of b "+b);    
    }
   static <T> void Printype(T value){
        System.out.println(value.getClass().getName());
    }

}



public class ex_genric {
    /**
     * @param args
     */
    public static void main(String[] args) {
        genricc <Integer> g1 = new genricc();
        g1.a = 10;
        g1.b = 20;
        genricc <String> g2 = new genricc();
        g2.a = "rcout";
        g2.b = "op";
        g1.show();
        g2.show();
        genricc.Printype(200);
        genricc.Printype("Varun");
    }
}
